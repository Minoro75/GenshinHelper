include(":app")
rootProject.name = "Akasha Terminal"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    resolutionStrategy {
        /** this section is a replace of classic classpath{} approach to plugins configuration **/
        eachPlugin {
            when (requested.id.id) {
                "com.android.application" -> useVersion("8.3.0-alpha01")
                "com.android.library" -> useVersion("8.3.0-alpha01")
                "org.jetbrains.kotlin.plugin.serialization" -> useVersion("1.9.0")
                "org.jetbrains.kotlin.android" -> useVersion("1.9.0")
                "com.google.dagger:hilt-android-gradle-plugin" -> useVersion("2.43.2")
                "com.google.firebase:firebase-crashlytics-gradle" -> useVersion("2.9.2")
                "com.google.gms:google-services" -> useVersion("4.3.14")
            }
        }
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
