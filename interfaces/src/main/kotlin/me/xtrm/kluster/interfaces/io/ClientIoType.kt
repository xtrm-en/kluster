package me.xtrm.kluster.interfaces.io

enum class ClientIoType(val title: String) {
    AR6_NODE("Ar6Node"),
    ARC4_ACTIVE("Arc4Active"),
    ARC4_PASSIVE("Arc4Passive"),
    PCXX("PCxx"),
    TELNET("Telnet"),
    TELNET_EXT_COMMENT("TelnetExtComment"),
    REVERSE_BEACON_WEB("ReverseBeaconWeb"),
    MIRC("Mirc")
}