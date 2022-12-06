plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.firebase.crashlytics") version "2.9.2"
    id("com.google.gms.google-services") version "4.3.14"
    id("com.google.dagger.hilt.android") version Dependencies.Hilt.daggerHiltVersion
    id("org.jetbrains.kotlin.kapt") version Dependencies.kotlinVersion
}

@Suppress("UnstableApiUsage")
android {
    namespace = "io.minoro75.genshinhelper"
    compileSdk = Config.compileSdk

    defaultConfig {
        applicationId = Config.packageName
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Version.versionCode
        versionName = Version.versionName

        // will remove all 3rd-party translations in libs, except listed
         resourceConfigurations.addAll(listOf("en","ru-rRU"))
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Compose.version
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.materialWindowSize)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.animation)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.navigation)
    implementation(Dependencies.Compose.viewmodel)
    implementation(Dependencies.Compose.viewmodelCompoe)
    implementation(Dependencies.Compose.runtimeCompose)

    implementation(Dependencies.Hilt.hilt)
    kapt(Dependencies.Hilt.kaptHilt)
    implementation(Dependencies.Hilt.hiltNavCompose)

    implementation(Dependencies.Other.moshi)
    kapt(Dependencies.Other.moshiCodegen)
    implementation(Dependencies.Other.coil)
    implementation(Dependencies.Other.chromeTabs)
    implementation(Dependencies.Other.firebaseCrashlytics)
    implementation(Dependencies.Other.firebaseAnalytics)

    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.5.1")
    implementation(Dependencies.Compose.appCompat)
    implementation(Dependencies.Compose.appResources)

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.1")

    debugImplementation(Dependencies.Compose.uiTooling)
    debugImplementation(Dependencies.Compose.uiTestManifest)
}
