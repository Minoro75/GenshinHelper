object Dependencies {

    object Compose {
        const val version = "1.2.0"
        const val material3Version = "1.0.0-alpha14"
        const val navigationVersion = "2.5.2"

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
    }

    object Hilt {
        const val daggerHiltVersion = "2.43.2"

        const val hilt = "com.google.dagger:hilt-android:$daggerHiltVersion"
        const val kaptHilt = "com.google.dagger:hilt-compiler:$daggerHiltVersion"
        const val hiltNavCompose = "androidx.hilt:hilt-navigation-compose:1.0.0"

    }

    object Other {
        const val moshiVersion = "1.13.0"
        const val coilVersion = "2.2.0"

        const val coil = "io.coil-kt:coil-compose:$coilVersion"
        const val moshi = "com.squareup.moshi:moshi-kotlin:$moshiVersion"
        const val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"
    }
}
