plugins {
    kotlin("jvm") version "1.4.10" apply false
    java
}

subprojects {
    group = "me.xtrm"
    version = "1.0.0-SNAPSHOT"

    apply(plugin = "kotlin")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.9.0")
    }
}
