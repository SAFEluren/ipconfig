plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "2.1.0"
}

group = "fun.oyama.mcplugin"
version = "1.0-SNAPSHOT"

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}


java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}


tasks {
    runServer {
        // Configure the Minecraft version for our task.
        // This is the only required configuration besides applying the plugin.
        // Your plugin's jar (or shadowJar if present) will be used automatically.
        minecraftVersion("1.20.1")
    }
}