plugins {
    alias(libs.plugins.android.application)
}

android {
    // ⚙️ namespace (thay cho package trong Manifest)
    namespace = "com.example.a1150070050_nguyenngoctuvy_th_lab5"

    // ⚙️ API compile & target
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.a1150070050_nguyenngoctuvy_th_lab5"
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

    // ✅ Bật ViewBinding để thao tác UI dễ hơn
    buildFeatures {
        viewBinding = true
    }

    // ✅ Chỉnh compatibility cho Java
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // ✅ (Tùy chọn) build tool mới hơn hỗ trợ Android 14
    packaging {
        resources.excludes.addAll(
            listOf(
                "META-INF/DEPENDENCIES",
                "META-INF/NOTICE",
                "META-INF/LICENSE",
                "META-INF/LICENSE.txt",
                "META-INF/NOTICE.txt"
            )
        )
    }


    dependencies {
        implementation(libs.appcompat)
        implementation(libs.material)
        implementation(libs.activity)
        implementation(libs.constraintlayout)

        testImplementation(libs.junit)
        androidTestImplementation(libs.ext.junit)
        androidTestImplementation(libs.espresso.core)
    }
}
