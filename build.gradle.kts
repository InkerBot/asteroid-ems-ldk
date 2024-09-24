plugins {
    id("java")
    id("maven-publish")
}

group = "io.asteroid.ldk"
version = "1.0"

repositories {
    mavenCentral()
}

java {
    withJavadocJar()
    withSourcesJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven("https://s0.blobs.inksnow.org/maven/") {
            credentials {
                username = System.getenv("IREPO_USERNAME")
                password = System.getenv("IREPO_PASSWORD")
            }
        }
    }
}