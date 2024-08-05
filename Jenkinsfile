pipeline {
	agent any

	environment {
	    jdkHome = tool 'jdk-jenkins'
		mavenHome = tool 'maven-jenkins'
	}

	tools {
		maven 'maven-jenkins'
	}

	stages {
		stage('Build'){
			steps {
			   sh "mvn clean install"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    sh "mvn docker:build"
			    sh "mvn docker:push"
			}
		}
	}
}