node {
		stages {
						stage('checkout') {
								steps {
									git branch: 'master', url: 'https://github.com/Naveena87/tomcat_project.git' 
										}
								}

						stage('test') {
								steps {
									sh 'mvn clean test'
										}
								}

						stage('build') {
								steps {
									sh 'mvn install'
										}
								}

						stage('deploy') {
								steps {
									sh 'sudo cp /var/lib/jenkins/workspace/jenkins_declarative/target/*.war 
									/opt/apache-tomcat-9.0.65/webapps/'
										}
								}

				}

}
