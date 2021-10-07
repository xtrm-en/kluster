package me.xtrm.kluster.interfaces

enum class ConnectStateType(val title: String) {
    ARX_NODE("ArxNode"),
    ARX_CLIENT("ArxClient"),
    TELNET_USER("TelnetUser"),
    AGW_BPQ_USER("AgwBpqUser"),
    PCXX_NODE("PcxxNode"),
    PCXX_USER("PcxxUser"),
    PC92_NODE("Pc92Node"),
    PC92_USER("Pc92User"),
    RCV_ONLY("RcvOnly")
}