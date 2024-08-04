pipeline {
	agent any

	environment {
		mavenHome = tool 'maven-jjenkins'
	}

	tools {
		jdk 'jdk17'
		maven 'Maven 3.9.8'
	}

	stages {
		stage('Build'){
			steps {
			    sh "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    sh "mvn jar:jar deploy:deploy"
			}
		}
	}
}