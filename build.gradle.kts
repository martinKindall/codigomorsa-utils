import magik.createGithubPublication
import magik.github
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.20"
    application
    id("elect86.magik") version "0.2.4"
    `maven-publish`
}

group = "org.codigomorsa"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

publishing {
    publications {
        // you can pass a name to overwrite the default "github"
        // createGithubPublication("my-name")
        createGithubPublication {
            groupId = "org.codigomorsa"
            artifactId = "utils"
            version = "0.1"

            from(components["java"])
        }
    }
    // don't use `repositories.github(..)`, it won't work
    // the dsl construct is necessary to distinguish it from a consume-only repo
    repositories {
        github {
            // this is superfluous since `github` is the default value, but it determines
            // the token name to fetch and the consequent publishing task name
            // eg: publishMavenPublicationToGithubRepository
            name = "github"

            // this is mandatory instead: $owner/$repo on github domain
            domain = "martinKindall/codigomorsa-utils" // aka https://github.com/kotlin-graphics/mary
        }
    }
}