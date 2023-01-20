def call() {
    sh 'echo Hello World from SL'

    
}

def loadCredential() {
    node {
        environment {
            TOKEN = credentials('secret1')
        }
        
        stage('load credentials') {
            sh "echo load credentials stage ${TOKEN}"
        }
    }
}