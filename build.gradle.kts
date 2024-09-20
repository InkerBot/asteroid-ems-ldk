plugins {
    id("java")
    id("maven-publish")
}

group = "io.asteroid.ldk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    withJavadocJar()
    withSourcesJar()
}
