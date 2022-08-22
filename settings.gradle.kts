include(":app")
rootProject.name = "Genshin Helper"

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
                "com.android.application" -> useVersion("7.2.1")
                "com.android.library" -> useVersion("7.2.1")
                "org.jetbrains.kotlin.android" -> useVersion("1.7.0")
                "com.google.dagger:hilt-android-gradle-plugin" -> useVersion("2.43.2")
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
