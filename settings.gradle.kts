plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "PixelAI"
include("app")
include("core:api")
findProject(":core:api")?.name = "api"
