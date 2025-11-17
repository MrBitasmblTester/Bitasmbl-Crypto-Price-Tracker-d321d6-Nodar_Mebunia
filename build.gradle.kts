// build.gradle.kts - Kotlin/JS with React
plugins {
  kotlin("js") version "1.8.0"
}
kotlin {
  js(IR) { browser { commonWebpackConfig { cssSupport.enabled = true } } binaries.executable() }
}
dependencies {
  implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.332")
  implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.332")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
  implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")
} 