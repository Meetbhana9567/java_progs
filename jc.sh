echo "Hello Welcome to the automated Java Compile Run Script"

n=$#

for i in $*
do

javac $i.java
java $i

done
