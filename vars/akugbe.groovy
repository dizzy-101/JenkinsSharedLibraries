def call(String stageName){

   if ("${stageName}" == "Intro")
     {
       sh "echo' WELCOME TO THE DEPLOYMENT OF AKUGBE' "
     }
  
  else if ("${stageName}" == "Build")
     {
       sh "mvn clean package"
     }
  else if ("${stageName}" == "SonarQube Report")
     { 
       sh "echo' running QA on akugbe' "
       //sh "mvn clean sonar:sonar"
     }
  else if ("${stageName}" == "Upload Into Nexus")
     { 
       sh "echo' uploading artifacts of akugbe' "
       //sh "mvn clean deploy"
     }
}
