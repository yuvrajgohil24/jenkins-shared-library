def call(String Project, String ImgTag, String DockerHubUser){
   withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable:'dockerHubPass', usernameVariable:'dockerHubUser')]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
   
                sh "docker image tag notes-app:latest ${dockerHubUser}/${Project}:${ImgTag}"
                sh "docker push ${dockerHubUser}/${Project}:${ImgTag}"
}
}
