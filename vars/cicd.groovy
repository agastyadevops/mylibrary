def newgit(repo)
{
 	git"${repo}"
}

def newmvn()
{
 	sh.'mvn package'
}
