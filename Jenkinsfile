pipeline {
    agent any
    environment {
        DOCKERHUB_CREDS = credentials('dockerhub-credentials')
    }
    stages {
        stage ('Stage 1 - Checkout Code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']],
                    doGenerateSubmoduleConfigurations: false, extensions: [],
                    submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e69ff7f5-1d77-48c6-9f2c-b2123caac355',
                    url: 'https://github.com/echrysanthakopou/backend.git']]])
            }
        }
        stage('Stage 2 - Build Project') {
            steps {
                sh('mvn clean package')
            }
        }
        stage('Stage 3 - Build Docker Image') {
            steps {
                sh('docker build . -t echrysanthakopou/back:latest')
                sh("docker build . -t echrysanthakopou/back:${env.GIT_COMMIT}")
            }
        }
        stage('Stage 4 - Push Image In DockerHub') {
            steps {
                sh('docker login -u $DOCKERHUB_CREDS_USR -p $DOCKERHUB_CREDS_PSW')
                sh('docker push  echrysanthakopou/back:latest')
                sh("docker push  echrysanthakopou/back:${env.GIT_COMMIT}")
            }
        }
        stage('Stage 5 - Deploy Backend') {
            steps {
                sh('microk8s kubectl apply -f ./k8s')
                sh("microk8s kubectl set image deployment backend pensionapp-backend=echrysanthakopou/back:${env.GIT_COMMIT} --namespace=pensionapp")
            }
        }
    }
}
