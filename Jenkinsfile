pipeline {
    agent any
    
    environment {
        MAVEN_HOME = tool 'Maven'
    }
    
    stages {
        stage('Build') {
            steps {
                sh "${env.MAVEN_HOME}/bin/mvn clean package"
            }
        }
        
        stage('Test') {
            steps {
                sh "${env.MAVEN_HOME}/bin/mvn test"
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
        
        stage('Deploy') {
            steps {
                sh 'cp target/myapp.war /path/to/local/server/deploy/directory/'
            }
            post {
                success {
                    echo 'Deployment successful!'
                }
                failure {
                    echo 'Deployment failed!'
                }
            }
        }
        
        stage('Clean Up') {
            steps {
                sh 'rm -rf target/'
            }
        }
    }
}
