// Powered by Infostretch 

timestamps {

node () {

	stage ('Dev Homework - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e69ff7f5-1d77-48c6-9f2c-b2123caac355', url: 'https://github.com/echrysanthakopou/backend.git']]]) 
	}
	stage ('Dev Homework - Build') {
 	
// Unable to convert a build step referring to "hudson.plugins.timestamper.TimestamperBuildWrapper". Please verify and convert manually if required.		// Shell build step
sh """ 
date
mvn clean
mvn clean install 
 """
		archiveArtifacts allowEmptyArchive: false, artifacts: 'target/*.jar', caseSensitive: true, defaultExcludes: true, fingerprint: false, onlyIfSuccessful: false 
	}
}
}