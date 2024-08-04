pipeline {
	agent any

	environment {
	    jdkHome = tool 'jdk-jenkins'
		mavenHome = tool 'maven-jenkins'
	}

	tools {
		maven "${mavenHome}"
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