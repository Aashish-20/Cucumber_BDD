pipeline {
    agent any
   
    stages {
        stage('Starting') {
            steps {
                echo 'Started pipeline'
            }
        }
    
        stage('setup'){
            steps{
                bat 'mvn clean'
            }
        }
        stage('test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Building'){
            steps{
                bat 'mvn clean install -Dmaven.test.skip=true'
            }
        }
    }
}
// pipeline {
//     agent any
    

    
//     stages {
//         stage('Build') {
//             steps {
//                 bat "mvn clean package"
//             }
//         }
        
//         stage('Test') {
//             steps {
//                 // bat "mvn test"
//                 bat "mvn test"
//                 junit '*/target/surefire-reports/TEST-.xml'
//             }
//             post {
//                 failure {
//                     script {
//                         currentBuild.result = 'FAILED'
//                     }
//                 }
//             }
//         }
        
        
//         stage('Clean Up') {
//             steps {
//                 bat 'rm -rf target/'
//             }
//         }
//     }
// }
