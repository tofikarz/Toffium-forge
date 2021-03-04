buildscript {
    repositories {
        maven(url = "https://files.minecraftforge.net/maven")
        jcenter()
        mavenCentral()
    }
}

plugins {
    id("eclipse")
}
    
    archiveFileName.set("Toffium-forge-1.16.5.jar")
}

minecraft {
    mappings channel("snapshot:version:20201028-1.16.3")

    runs {
        client {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    sourceSets {
                    main
                }
            }
        }
        }

        server {
            workingDirectory project.file("run")

            property("forge.logging.markers:REGISTRIES")
            property("forge.logging.console.level:debug")

            mods {
                examplemod {
                    sourceSets {
                        main
                }
            }
        }
    }
}
}

    dependencies {
    implementation("net.minecraftforge:forge:1.16.4-35.1.37")
    }
        
apply(from = "mcreator.gradle")
