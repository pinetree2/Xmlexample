<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>
<xsl:template match = "/class">
    <html>
        <body>
            <h2>Student List</h2>
            <table border = "1">
                <tr bgcolor ="lightgreen">
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Nick Name</th>
                    <th>Age</th>
                    <th>gender</th>
                    <th>Birth</th>
                </tr>

                <xsl:for-each select = "student">
                    <tr>
                        <td><xsl:value-of select = "firstname"></xsl:value-of></td>
                        <td><xsl:value-of select = "lastname"></xsl:value-of></td>
                        <td><xsl:value-of select = "nickname"></xsl:value-of></td>
                        <td><xsl:value-of select = "age"></xsl:value-of></td>
                        <td><xsl:value-of select = "gender"></xsl:value-of></td>
                        <td><xsl:value-of select = "birth"></xsl:value-of></td>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>