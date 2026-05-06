plugins {
    alias(libs.plugins.kotlin.jvm)
    application
    antlr
}

repositories {
    mavenCentral()
}

dependencies {
    antlr("org.antlr:antlr4:4.13.2")
    implementation("org.antlr:antlr4-runtime:4.13.2")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "org.example.AppKt"
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor")
    outputDirectory = file("${layout.buildDirectory.get()}/generated-src/antlr/main")
}
tasks.compileKotlin {
    dependsOn(tasks.generateGrammarSource)
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}