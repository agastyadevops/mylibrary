def newgit(repo)
{
 	git"${repo}"
}

def newMaven()
{
 	sh 'mvn package'
}
def newDeploy(workspace,ip,context)
{
   sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}  
  
def newselenium(workspace)
{
sh "java -jar /var/lib/jenkins/workspace/${workspace}/testing.jar"
}
