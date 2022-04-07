@Library('javahome-demo') _
properties([
        parameters([
                string(name: 'service_name', defaultValue: 'sale-point-service', description: 'Service-name',),
                string(name: 'IMAGE_TAG', defaultValue: '', description: 'Image TAG',),
                string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered',),
                string(name: 'environment', defaultValue: 'default', description: 'Which cluster you need to deploy, default/bricks-tst/bricks-acc/bricks-prd',),
        ])
])
currentBuild.displayName = "${service_name}-#"+currentBuild.number
currentBuild.description = "<b>environment: </b>default<br/><b>version:</b>1.2.2<br/><b>PR:</b>12"
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
                buildapp("${service_name}")
                currentBuild.description = "<b>environment: </b>default<br/><b>version:</b>1.2.2<br/><b>PR:</b>12"
            }
        }

        stage("OWASP") {
            steps {
                checkOwasp()
            }
        }

        stage("start build and push image") {
            steps {
                buildimage("${VERSION}")
            }
        }

        stage("deploy") {
            steps {
                createhelm("${IMAGE}")
            }
        }

    }
}
