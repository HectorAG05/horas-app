plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hectoralex.horas"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.hectoralex.horas"
        // minSdk 26: nos apoyamos en Adaptive Icons (API 26+), que evita tener
        // que generar íconos PNG de respaldo para versiones más viejas de Android.
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    // WebViewAssetLoader: sirve los assets locales por https://appassets.androidplatform.net/
    // en vez de file://, que es lo que Google recomienda para WebViews modernas.
    implementation("androidx.webkit:webkit:1.12.1")
}
