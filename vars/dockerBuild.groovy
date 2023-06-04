def call(String projectImage, String ImageTag, String hubUser){
    
    sh """
      docker image build -t ${hubUser}/${projectImage} . 
      docker image tag ${hubUser}/${projectImage} ${hubUser}/${projectImage}:${ImageTag}
      docker image tag ${hubUser}/${projectImage} ${hubUser}/${projectImage}:latest
     """
 }




/*
def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker build -t ${ecr_repoName} .
     docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
*/