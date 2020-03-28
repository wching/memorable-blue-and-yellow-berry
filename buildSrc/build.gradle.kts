plugins {
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
    maven(url = "https://plugins.gradle.org/m2/")
}

dependencies {
    implementation("com.android.tools.build:gradle:3.6.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.71")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.6.0")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:9.2.1")
}
