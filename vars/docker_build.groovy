def call(String ProjectName, String ImgName, String DockerHubUser){
       sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImgName} ."
}
