n=$#

for i in $*

do
javac $i
appletviewer $i
done

rm *~

rm *.class


