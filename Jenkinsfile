pipeline {
    agent any
    tools {
        maven 'maven'
    }
    stages {
        stage("Clean up") {
            steps {
                deleteDir()
            }
        }
        stage("Clone repo") {
            steps {
                sh 'git clone https://github.com/ghadaabassi/PipelineSpringBoot.git'
            }
        }
        stage("Generate backend image") {
            steps {
                dir("PipelineSpringBoot") {
                    sh "mvn clean install"
                    sh "docker build -t hello-spring ."
                }
            }
        }
        stage("Run docker compose") {
            steps {
                dir("PipelineSpringBoot") {
                    sh "docker compose up -d" 
                }
            }
        }
    }
}
