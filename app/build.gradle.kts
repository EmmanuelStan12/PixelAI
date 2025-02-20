plugins {
    kotlin("jvm") version "1.9.23"
    id("org.springframework.boot") version "3.3.1"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("plugin.spring") version "1.9.24"
    kotlin("plugin.allopen") version "1.9.24"
}

dependencies {
    implementation(project(":features:posts"))
}
