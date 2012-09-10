<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>ZEPRS Data Dictionary</title>
                <style type="text/css">
                    body {font-family: Tahoma, Verdana, Arial, sans-serif; font-size:10pt}
                    pre {font-family: Tahoma, Verdana, Arial, sans-serif; font-size:10pt}
                    .mainTable {}
                    .database {background-color: rgb(213,219,225); font-size:14pt; font-weight: bold;}
                    .databaseDesc {font-size:10pt}
                    .table {background-color: rgb(213,219,225); font-size:12pt; font-weight: bold;}
                    .tableDesc {font-size:10pt}
                    .tableColHeaders {background-color: rgb(213,219,225); font-size:10pt; font-weight: bold;}
                    .columnOdd {background-color: #efefef; font-size:10pt;}
                    .columnEven {background-color: white; font-size:10pt;}
                </style>
            </head>
            <body>
                <h1>ZEPRS Data Dictionary</h1>
                <p><strong>Note:</strong> This file is automatically generated. Do not edit this file.</p>
                <table class="mainTable">
                <xsl:for-each select="database">
                    <tr class="database"><td colspan="7">Database: <xsl:value-of select="@name"/></td></tr>
                    <tr class="databaseDesc"><td colspan="7"><pre>Description: <xsl:value-of select="text()"/></pre></td></tr>
                    <xsl:for-each select="table">
                        <tr class="tableDesc"><td colspan="7">&#160;</td></tr>
                        <tr class="table"><td colspan="7">Table: <xsl:text disable-output-escaping="yes">&lt;a name=&quot;</xsl:text><xsl:value-of select="@name"/><xsl:text disable-output-escaping="yes">&quot;&gt;</xsl:text><xsl:value-of select="@name"/></td></tr>
                        <tr class="tableDesc"><td colspan="7">Description: <xsl:value-of select="@description"/></td></tr>
                        <tr class="tableColHeaders">
                            <td>Column:</td>
                            <td>Description:</td>
                            <td>Type:</td>
                            <td>Size:</td>
                            <td>Required:</td>
                            <td>PK:</td>
                            <td>FK:</td>
                        </tr>
                        <xsl:for-each select="column">
                            <tr class="columnOdd">
                                <xsl:if test="position() mod 2 = 0">
                                    <xsl:attribute name="class">columnEven</xsl:attribute>
                                </xsl:if>
                                <td><xsl:value-of select="@name"/></td>
                                <td>
                                    <xsl:choose>
                                    <xsl:when test="@description"><xsl:value-of select="@description"/></xsl:when>
                                    <xsl:otherwise>See common columns for description</xsl:otherwise>
                                    </xsl:choose>
                                </td>
                                <td><xsl:value-of select="@type"/></td>
                                <td>
                                    <xsl:choose>
                                    <xsl:when test="@size"><xsl:value-of select="@size"/></xsl:when>
                                    <xsl:otherwise>&#160;</xsl:otherwise>
                                    </xsl:choose>
                                </td>
                                <td><xsl:value-of select="@required"/></td>
                                <td><xsl:value-of select="@primaryKey"/></td>
                                <xsl:variable name="fk" select="@name"/>
                                <td><xsl:text disable-output-escaping="yes">&lt;a href=&quot;#</xsl:text><xsl:value-of select="../foreign-key[reference[@local=$fk]]/@foreignTable"/>"<xsl:text disable-output-escaping="yes">&quot;&gt;</xsl:text><xsl:value-of select="../foreign-key[reference[@local=$fk]]/@foreignTable"/><xsl:text disable-output-escaping="yes">&lt;/a&gt;</xsl:text></td>
                            </tr>
                        </xsl:for-each>
                    </xsl:for-each>
                </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>