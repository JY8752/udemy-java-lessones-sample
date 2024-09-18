plugins {
    id("com.gradleup.shadow") version "8.3.1"
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.2")
}

// JARタスクでJARファイルを作っても外部依存のjacksonが含まれていない
tasks.jar {
    manifest {
        attributes["Main-Class"] = "org.example.Main"
    }
}
