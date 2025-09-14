plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
}

android {
    namespace = "com.github.netsugo.twemoji"
    compileSdk = 36
    defaultConfig {
        minSdk = 21

        vectorDrawables {
            useSupportLibrary = false
            generatedDensities?.clear()
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
