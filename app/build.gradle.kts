plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
   // id("kotlin-kapt")
    kotlin("plugin.serialization") version "2.0.0"
}

android {
    namespace = "com.example.fomato"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.fomato"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)




    //Glide for image loading(xlm)
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("com.github.bumptech.glide:compose:1.0.0-alpha.1")

// ✅ Image Loading (Jetpack Compose)
    implementation("io.coil-kt:coil-compose:2.6.0") // Coil is lightweight and Compose-friendly


// ✅ Jetpack Compose Material Icons
    implementation("androidx.compose.material:material-icons-extended:1.7.8")

// ✅ Hilt (Dependency Injection)
    implementation("com.google.dagger:hilt-android:2.56.2")
    ksp("com.google.dagger:hilt-compiler:2.56.2")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    ksp("androidx.hilt:hilt-compiler:1.2.0") // Use KSP version of hilt compiler

// ✅ Navigation (Jetpack Compose)
    implementation("androidx.navigation:navigation-compose:2.8.0-beta06")

// ✅ Serialization (for parsing JSON)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")

// ✅ ViewPager-like behavior in Compose
    implementation("com.google.accompanist:accompanist-pager:0.28.0")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.28.0")

// ✅ Payment Gateway (Razorpay)
    implementation("com.razorpay:checkout:1.6.40")

// ✅ Animated Bottom Navigation Bar (Canopas)
    implementation("com.canopas.compose-animated-navigationbar:bottombar:1.0.1")

// ✅ Lottie for animations (like "Order placed" success animation)
    implementation("com.airbnb.android:lottie-compose:4.2.0")

// ✅ System UI Controller (e.g., change status bar color in Compose)
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.32.0")

// ✅ Android 12+ Splash Screen
    implementation("androidx.core:core-splashscreen:1.0.1")



}