def call(String stageName){

   if ("${stageName}" == "Intro")
     {
       sh "echo 'WELCOME TO THE DEPLOYMENT OF AKUGBE NODEJS APP'"
       sh "echo 'running the CICD akugbe'"
     }
  
  else if ("${stageName}" == "Build")
     {
       sh "npm install"
     }
  else if ("${stageName}" == "SonarQube Report")
     { 
       sh "echo 'running QA on akugbe'"
       sh "echo 'lets go on akugbe'"
       sh "npm run sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     { 
       sh "echo 'uploading artifacts of akugbe' "
       sh "echo 'running QA on akugbe'"
       //sh "npm publish"
       sh 'chmod u+x ./scripts/nexus.sh'
       sh './scripts/nexus.sh'
       sh 'npm publish'
     }
}
