plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.hilt)
    id("kotlin-kapt")
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.example.samplesns.data"
    compileSdk = 34

    defaultConfig {
        minSdk = 23

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation(project(":domain"))

    //hilt
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)

    // serialization
    implementation(libs.kotlinx.serialization.json)

    //retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.serialization)

    //okHttp
    implementation(libs.okhttp)
}