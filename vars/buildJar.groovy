#!/usr/bin/env groovy

def call() {
    echo "Building the Application"
    sh 'mvn package'
}