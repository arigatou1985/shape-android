plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.example.shapeandroid"
    compileSdk = 34

    defaultConfig {
        minSdk = 26
        targetSdk = 34
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Add your dependencies here
    implementation("com.google.android.material:material:1.9.0")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


}
