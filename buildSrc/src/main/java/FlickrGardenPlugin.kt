import com.android.build.gradle.AppPlugin
import com.android.build.gradle.LibraryPlugin
import com.android.build.gradle.TestedExtension
import io.gitlab.arturbosch.detekt.extensions.DetektExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionContainer
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class FlickrGardenPlugin : Plugin<Project> {

    // region Companion Object

    companion object {
        const val DEBUG = "debug"
        const val RELEASE = "release"
    }

    // endregion

    // region Plugin

    override fun apply(project: Project) {
        with(project) {
            plugins.all {
                when (this) {
                    is AppPlugin,
                    is LibraryPlugin -> extensions.getByType<TestedExtension>().apply {
                        setUpAndroidModules(extension = this, project = project)
                    }
                }
            }

            setUpCommon(project = project)
        }
    }

    // endregion

    // region Private Api

    private fun setUpAndroidModules(
        project: Project,
        extension: TestedExtension
    ) {
        extension.apply {
            setCompileSdkVersion(SdkVersion.compileSdkVersion)

            defaultConfig.apply {
                minSdkVersion(SdkVersion.minSdkVersion)
                targetSdkVersion(SdkVersion.targetSdkVersion)
                testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            }

            compileOptions.apply {
                sourceCompatibility = JavaVersion.VERSION_1_8
                targetCompatibility = JavaVersion.VERSION_1_8
            }

            sourceSets.getByName("androidTest")
                .assets.srcDirs(project.files("${project.projectDir}/schemas"))

            val isMinifyOn = project.plugins.hasPlugin(AppPlugin::class.java)

            buildTypes.apply {
                getByName(DEBUG).run {
                    isTestCoverageEnabled = true
                    isMinifyEnabled = false
                    isDebuggable = true
                    isZipAlignEnabled = false
                }

                getByName(RELEASE).run {
                    isMinifyEnabled = isMinifyOn
                    isZipAlignEnabled = true
                }
            }
        }
    }

    private fun setUpCommon(project: Project) {
        project.run {
            apply(plugin = "org.jlleitschuh.gradle.ktlint")
            configure<KtlintExtension> {
                outputToConsole.set(true)
            }

            apply(plugin = "io.gitlab.arturbosch.detekt")
            configure<DetektExtension> {
                reports {
                    xml.enabled = true
                    xml.destination =
                        project.file("${project.buildDir}/reports/detekt/detekt.xml")
                    html.enabled = false
                }
                config = files("${rootProject.projectDir}/klmflightsapp-detekt-rules.yml")
                baseline = file("detekt-baseline.xml")
                buildUponDefaultConfig = true
            }
        }
    }
}

inline fun <reified T : Any> ExtensionContainer.getByType(): T = getByType(T::class.java)
