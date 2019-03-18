

pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
      stage('SCM') {
                  steps {
        git 'https://github.com/atomorojo/PetSitters.git'
        }
      }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
     stage('SonarQube analysis') {
     steps{
    withSonarQubeEnv('Sonarqube') {
      // requires SonarQube Scanner for Maven 3.2+
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
    }
  }
  }
  }
}


