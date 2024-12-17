pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube for Jenkins') {
                    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=com.lunoxx.tp-automatisation -Dsonar.projectName='tp-automatisation' -Dsonar.host.url=http://localhost:9000"
                    echo 'SonarQube Analysis Completed'
                }
            }
        }

        stage('Quality Gate Check') {
            steps {
                script {
                    sleep 30
                    def qualityGate = waitForQualityGate()

                    if (qualityGate.status != 'OK') {
                        error "Quality Gate failed: ${qualityGate.status}"
                    } else {
                        echo "Quality Gate passed"
                    }
                }
            }
        }
    }
}