#!/usr/bin/env groovy

def call(){
    echo "building the Docker Image"
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t zeacot/pop:java_maven_app-2.0'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push zeacot/pop:java_maven_app-2.0'
    }
}