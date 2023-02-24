object Dependencies {

    const val kotlinVersion = "1.7.10"

    object Compose {
        const val version = "1.3.1"
        const val material3Version = "1.1.0-alpha02"
        const val navigationVersion = "2.5.2"
        const val lifecycle_version = "2.6.0-alpha03"
        const val app_compat_versioon = "1.7.0-alpha01"
        const val accompanist_version = "0.29.1-alpha"


        const val activity = "androidx.activity:activity-compose:1.6.1"
        const val uiController = "com.google.accompanist:accompanist-systemuicontroller:$accompanist_version"
        const val insets = "com.google.accompanist:accompanist-insets:$accompanist_version"
        const val webview = "com.google.accompanist:accompanist-webview:$accompanist_version"
        const val appCompat = "androidx.appcompat:appcompat:$app_compat_versioon"
        const val appResources = "androidx.appcompat:appcompat-resources:$app_compat_versioon"
        const val ui = "androidx.compose.ui:ui:$version"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val material = "androidx.compose.material3:material3:$material3Version"
        const val materialWindowSize =
            "androidx.compose.material3:material3-window-size-class:$material3Version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val animation = "androidx.compose.animation:animation:$version"
        const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

        const val uiTooling = "androidx.compose.ui:ui-tooling:$version"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"

        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
        const val viewmodelCompoe =
            "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version"
        const val runtimeCompose = "androidx.lifecycle:lifecycle-runtime-compose:$lifecycle_version"
    }

    object Hilt {
        const val daggerHiltVersion = "2.44"

        const val hilt = "com.google.dagger:hilt-android:$daggerHiltVersion"
        const val kaptHilt = "com.google.dagger:hilt-compiler:$daggerHiltVersion"
        const val hiltNavCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"

    }

    object Other {
        const val moshiVersion = "1.13.0"
        const val coilVersion = "2.2.0"
        const val chromeTabVersion = "1.4.0"


        const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx:18.2.13"
        const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx:20.1.2"

        const val coil = "io.coil-kt:coil-compose:$coilVersion"
        const val chromeTabs = "androidx.browser:browser:$chromeTabVersion"
        const val moshi = "com.squareup.moshi:moshi-kotlin:$moshiVersion"
        const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"
    }
}
