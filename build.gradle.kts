// Top-level build file where you can add configuration options common to all sub-projects/modules.

group = "com.example"
version = "1.0.2"

plugins {
//    id("com.android.library")
//    kotlin("android")
    `maven-publish`
    `java-library`
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}