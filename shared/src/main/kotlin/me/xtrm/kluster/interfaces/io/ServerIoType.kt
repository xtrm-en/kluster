package me.xtrm.kluster.interfaces.io

enum class ServerIoType(val title: String) {
    TELNET("Telnet"),
    ARX_NODE("ArxNode"),
    ARX_CLIENT("ArxClient"),
    PCXX("PCxx"),
    AGW_BQP_TCP("AgwBpqTcp"),
    ARC4_ACTIVE("Arc4Active"),
    ARC4_PASSIVE("Arc4Passive")
}