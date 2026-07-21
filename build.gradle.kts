plugins {
    kotlin("jvm") version "1.9.20" 
    `java-library`
    `maven-publish` 
}

group = "com.lpteam"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}


kotlin {
    jvmToolchain(17) 
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
