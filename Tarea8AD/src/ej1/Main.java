package ej1;

import java.io.File;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Main {
	// Clase que va a transformar un xml y xsl a html
	public void crearFicheros() throws TransformerConfigurationException {
		// Cargar el archivo XML y XSL
		// Crea un objeto File que apunta al archivo XML ubicado en la carpeta 'src'.
		File xmlFile = new File("./src/fichero.xml");
		// Crea un objeto File que apunta al archivo XSL ubicado en la carpeta 'src'.
		File xslFile = new File("./src/fichero.xsl");
		configurarTransformers(xslFile, xmlFile);
	}

	public void configurarTransformers(File xslFile, File xmlFile) throws TransformerConfigurationException {
		// Configurar el transformador
		// Crea una instancia de TransformerFactory para configurar el transformador.
		TransformerFactory fnaf = TransformerFactory.newInstance();
		// Crea un transformador usando el archivo XSL como origen.
		Transformer optimus = fnaf.newTransformer(new StreamSource(xslFile));
		crearHtml(optimus, xmlFile);

	}

	public void crearHtml(Transformer optimus, File xmlFile) {
		try {
			// Transformar el XML en un archivo HTML
			// Transforma el archivo XML usando la hoja de estilo XSL y guarda el resultado
			// en un nuevo archivo 'alumnos.html'.
			optimus.transform(new StreamSource(xmlFile), new StreamResult(new File("alumnos.html")));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		try {
			m.crearFicheros();
			// Imprime un mensaje de éxito en la consola.
			System.out.println("El archivo HTML ha sido generado con éxito.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
