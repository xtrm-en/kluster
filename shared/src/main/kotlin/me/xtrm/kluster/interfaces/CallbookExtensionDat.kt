package me.xtrm.kluster.interfaces

import java.util.regex.Pattern

data class CallbookExtensionDat(
    var zip: String,
    var arrlSection: String,
    var county: String,
    var gridSquare: String,
    var lat: Float,
    var lon: Float
) {
    constructor(line: String) {
        val content = line.split(Pattern.quote(","))
        if (content.size <= 2) return

        this.zip = content[0]
        this.arrlSection = content[1]
        this.county = content[2]
        this.gridSquare = content[3]
        this.lat = 0.0f
        this.lon = 0.0f
    }
}