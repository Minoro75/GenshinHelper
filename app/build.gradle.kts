plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.gradle)
    alias(libs.plugins.ksp)
    alias(libs.plugins.android.gms)
    alias(libs.plugins.firebase.crashlytics)
}

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
        resourceConfigurations.addAll(listOf("en", "ru-rRU", "uk", "pt-rBR"))
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        //compose metrics generation
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:metricsDestination=" + project.buildDir.absolutePath + "/compose_metrics")
        freeCompilerArgs += listOf(
            "-P",
            "plugin:androidx.compose.compiler.plugins.kotlin:reportsDestination="  + project.buildDir.absolutePath + "/compose_metrics")
    }
    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
    }
    packaging{
        resources{
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.material3)
    implementation(libs.compose.foundation)
    implementation(libs.compose.animation)
    implementation(libs.compose.runtime)
    debugImplementation(libs.compose.tooling)
    debugImplementation(libs.compose.test.manifest)
    implementation(libs.compose.tooling.preview)

    kapt(libs.hilt.compiler)
    implementation(libs.hilt.android)
    implementation(libs.hilt.composenav)

    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.analytics)

    implementation(libs.coil.compose)

    implementation(libs.core.chrometabs)
    implementation(libs.core.lifecycle.compose)
    implementation(libs.core.lifecycle.viewmodel.ktx)
    implementation(libs.core.lifecycle.viewmodel.compose)
    implementation(libs.core.lifecycle.runtime.ktx)
    implementation(libs.core.lifecycle.runtime.compose)

    implementation(libs.core.ktx)
    implementation(libs.core.activity)
    implementation(libs.core.appcompat)
    implementation(libs.core.navigationCompose)
    implementation(libs.core.splashscreen)
    implementation(libs.core.immutableLists)
    implementation(libs.core.serialization)
    implementation(libs.accompanist.insets)
    implementation(libs.accompanist.systemuicontroller)
    implementation(libs.accompanist.placeholder)

    testImplementation(libs.compose.test.junit4)
}
