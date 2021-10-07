package me.xtrm.kluster.interfaces.io

enum class ConnectionState(val title: String) {
    IDLE("Idle"),
    CALLSIGN_REQUEST("CallsignRequest"),
    CALLSIGN_VALIDATION("CallsignValidation"),
    CONNECTED("Connected")
}