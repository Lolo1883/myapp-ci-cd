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
			    git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'
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