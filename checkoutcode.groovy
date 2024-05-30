def call(String https://github.com/ninghotnikhil00/shared-lib.git, String main){
def workingDir = "${env.WORKSPACE}"
sh "git clone ${https://github.com/ninghotnikhil00/shared-lib.git} ${workingDir}"
sh "git checkout ${main}"
return workingDir
}
