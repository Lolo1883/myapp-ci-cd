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
			    git url: 'https://github.com/Lolo1883/myapp-ci-cd'
                 withMaven {
                   sh "mvn clean verify"
                 }
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