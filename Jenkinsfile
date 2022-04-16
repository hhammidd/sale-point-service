@Library('javahome-demo') _
properties([
        parameters([
                string(name: 'service_name', defaultValue: 'sale-point-service', description: 'Service-name',),
                string(name: 'IMAGE_TAG', defaultValue: '', description: 'Image TAG',),
                string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered',),
                string(name: 'environment', defaultValue: 'tst', description: 'Which cluster you need to deploy, default/bricks-tst/bricks-acc/bricks-prd',),
        ])
])
currentBuild.displayName = "${service_name}-#" + currentBuild.number
pipeline {

    environment {

        registry = "hhssaaffii/${service_name}"
        registryCredential = ''
        dockerImage = ''
        //Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
        IMAGE = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()

    }
    agent any
    stages {

        stage("start build process") {
            steps {
                startBuild("${service_name}", "${VERSION}")
            }
        }

        // TODO turn on later
//        stage("OWASP") {
//            steps {
//                checkOwasp()
//            }
//        }

        stage("start build and push image") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd") {
                        VERSION_PRD = "${VERSION}".substring(0, "${VERSION}".indexOf('-')) // maybe better way
                        buildimageProcess("${VERSION_PRD}")
                    } else {
                        buildimageProcess("${VERSION}")
                    }
                }

            }
        }

        stage("deploy") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd") {
                        createhelm("${service_name}", "${VERSION}") // TODO nodePOrt different than test
                    } else {
                        VERSION_SNAPSHOT = "${VERSION}"
                        createhelm("${service_name}", "${VERSION_SNAPSHOT}") // TODO
                    }
                }

            }
        }

        stage("bump up version") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd") {
                        bumpupVersion("${service_name}", "${branch}")
                    } else {
                        sh 'echo not bump feature'
                    }
                }
            }
        }

    }
}
