pipeline {
    agent any
    stages {
        stage('Starting') {
            steps {
                echo 'Started pipeline'
            }
        }
        stage('build'){
            steps{
                bat 'mvn clean install'
            }
        }
        stage('test'){
            steps{
                bat 'mvn test'
            }
        }
    }
}
