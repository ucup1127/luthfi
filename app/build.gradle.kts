plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // Hapus alias untuk compose kalau tidak dipakai
}

android {
    namespace = "com.luthfi.sanggar"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.luthfi.sanggar"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
        compose = false  // Nonaktifkan kalau gak pakai Compose
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}
