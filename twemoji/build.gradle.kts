plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.github.netsugo.twemoji"
    compileSdk = 36
    defaultConfig {
        minSdk = 19
    }
}
