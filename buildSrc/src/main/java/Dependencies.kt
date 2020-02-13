object SdkVersion {
    const val compileSdkVersion = 29
    const val minSdkVersion = 23
    const val targetSdkVersion = 29
}

object PluginDependencies {

    // region Gradle

    const val gradle = "com.android.tools.build:gradle:${Versions.androidToolsBuildGradleVersion}"

    // endregion

    // region Google Services

    const val googleServices = "com.google.gms:google-services:${Versions.googleGradleServicesVersion}"

    // endregion

    // region Kotlin Gradle

    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"

    // endregion

    // region Ktlint

    const val ktlint = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.gradleKtlintVersion}"

    // endregion

    // region Detekt

    const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detektGradlePluginVersion}"

    // endregion

    // region Navigation

    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidxNavigationVersion}"

    // endregion
}

object Versions {

    // region Android Tools

    const val androidToolsBuildGradleVersion: String = "3.5.3"

    // endregion

    // region AndroidX

    const val androidxAnnotationVersion: String = "1.1.0"

    const val androidxAppcompatVersion: String = "1.1.0"

    const val androidxConstraintlayoutVersion: String = "1.1.3"

    const val androidxCardviewVersion: String = "1.0.0"

    const val androidxCoreKtxVersion: String = "1.1.0"

    const val androidxFragment: String = "1.2.0"

    const val androidxLifecycleVersion: String = "2.1.0"

    const val androidxMaterialVersion: String = "1.2.0-alpha04"

    const val androidxNavigationVersion: String = "2.2.0"

    const val androidxRecyclerViewVersion: String = "1.1.0"

    // endregion

    // region Annotations

    const val javaxInjectVersion: String = "1"

    // endregion

    // region Dagger

    const val googleDaggerVersion: String = "2.26"

    // endregion

    // region Google Gradle Services

    const val googleGradleServicesVersion: String = "4.3.3"

    // endregion

    // region Google Maps

    const val googleMapsVersion: String = "17.0.0"

    // endregion

    // region Image Loading

    const val glideVersion: String = "4.10.0"

    // endregion

    // region Kotlin

    const val kotlinVersion: String = "1.3.61"

    // endregion

    // region Parser

    const val googleCodeGsonVersion: String = "2.8.6"

    // endregion

    // region RxJava

    const val rxJava2RxandroidVersion: String = "2.1.1"

    const val rxJava2Version: String = "2.2.16"

    const val rxrelay2Version: String = "2.1.1"

    // endregion

    // region Retrofit

    const val retrofit2Version: String = "2.7.1"

    // endregion

    // region OkHttp

    const val okhttp3Version: String = "4.2.2"

    // endregion

    // region Tools / Plugins

    const val detektGradlePluginVersion: String = "1.5.0"

    const val gradleKtlintVersion: String = "9.1.1"

    // endregion

    // region ThreeTen

    const val threetenabpVersion: String = "1.2.1"

    // endregion

    // region Tests

    const val mockitoKotlinVersion: String = "2.2.0"

    const val jUnitVersion: String = "4.12"

    const val jUnitParamsVersion: String = "1.1.1"

    // endregion
}

object Dependencies {

    // region AndroidX

    const val fragment = "androidx.fragment:fragment-ktx:${Versions.androidxFragment}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintlayoutVersion}"
    const val lifecycle =
        "androidx.lifecycle:lifecycle-common-java8:${Versions.androidxLifecycleVersion}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.androidxLifecycleVersion}"
    const val cardView = "androidx.cardview:cardview:${Versions.androidxCardviewVersion}"
    const val material = "com.google.android.material:material:${Versions.androidxMaterialVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.androidxRecyclerViewVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.androidxCoreKtxVersion}"

    // Kotlin
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidxNavigationVersion}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.androidxNavigationVersion}"

    // endregion

    // region Annotations

    const val javax = "javax.inject:javax.inject:${Versions.javaxInjectVersion}"

    // endregion

    // region Dagger

    const val dagger = "com.google.dagger:dagger:${Versions.googleDaggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.googleDaggerVersion}"

    // endregion

    // region Dates Helper

    const val threeTenAbp = "com.jakewharton.threetenabp:threetenabp:${Versions.threetenabpVersion}"

    // endregion

    // region Google Play Services

    const val googleMaps =
        "com.google.android.gms:play-services-maps:${Versions.googleMapsVersion}"

    // endregion

    // region Image Loading

    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"

    // endregion

    // region Kotlin

    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlinVersion}"

    // endregion

    // region Network

    const val gson = "com.google.code.gson:gson:${Versions.googleCodeGsonVersion}"
    const val okhttp3Logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3Version}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3Version}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit2Version}"
    const val retrofitConverter =
        "com.squareup.retrofit2:converter-gson:${Versions.retrofit2Version}"
    const val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit2Version}"

    // endregion

    // region Rx

    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava2Version}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxJava2RxandroidVersion}"
    const val rxRelay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rxrelay2Version}"

    // endregion

    // region Tests

    const val junit = "junit:junit:${Versions.jUnitVersion}"
    const val annotations = "androidx.annotation:annotation:${Versions.androidxAnnotationVersion}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinVersion}"
    const val jUnitParams = "pl.pragmatists:JUnitParams:${Versions.jUnitParamsVersion}"

    // endregion
}