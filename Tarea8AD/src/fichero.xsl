<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Lista de Alumnos</title>
            </head>
            <body>
                <h2>Lista de Alumnos</h2>
                <table border="1">
                    <tr>
                        <th>NIA</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Género</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Ciclo</th>
                        <th>Curso</th>
                        <th>Grupo</th>
                    </tr>
                    <xsl:for-each select="Alumnos/Alumno">
                        <tr>
                            <td><xsl:value-of select="@nia"/></td>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="apellidos"/></td>
                            <td><xsl:value-of select="genero"/></td>
                            <td><xsl:value-of select="fechadenacimiento"/></td>
                            <td><xsl:value-of select="ciclo"/></td>
                            <td><xsl:value-of select="curso"/></td>
                            <td><xsl:value-of select="grupo"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
