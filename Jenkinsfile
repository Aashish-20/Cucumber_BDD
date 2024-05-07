pipeline {
    agent any
    

    
    stages {
        stage('Build') {
            steps {
                bat "mvn clean package"
            }
        }
        
        stage('Test') {
            steps {
                // bat "mvn test"
                bat "mvn test"
                junit '*/target/surefire-reports/TEST-.xml'
            }
            post {
                failure {
                    script {
                        currentBuild.result = 'FAILED'
                    }
                }
            }
        }
        
        
        stage('Clean Up') {
            steps {
                bat 'rm -rf target/'
            }
        }
    }
}
