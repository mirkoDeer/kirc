plugins {
    `java-library`
    kotlin("libs.publisher")
}

dependencies {
    api(project(":kirc-core"))
    api(project(":kirc-image"))
    implementation(project(":kirc-suspending"))

    implementation(platform(coroutines.bom))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("org.jetbrains.kotlinx:kotlinx-io-core:0.7.0")
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name, "Implementation-Version" to project.version))
    }
}

kotlinPublications {
    publication {
        publicationName = "reactive"
        description = "GraalVM compatible project reactor based container image registry client written in kotlin"
    }
}
