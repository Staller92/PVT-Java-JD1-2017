<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/PointsList">
        <table border="1">
            <xsl:apply-templates/>
        </table>
    </xsl:template>
    <xsl:template match="/PointsList/point">
        <tr>

            <xsl:apply-templates/>

        </tr>
    </xsl:template>
    <xsl:template match="/PointsList/point/x">
        <td>

            <xsl:value-of select="text()"/>
            <xsl:value-of select="/PointsList/point/@unit"/>
        </td>
    </xsl:template>
    <xsl:template match="/PointsList/point/y">
        <td>
            <xsl:value-of select="text()"/>
            <xsl:value-of select="/PointsList/point/@unit"/>
        </td>
    </xsl:template>
</xsl:stylesheet>