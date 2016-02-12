call mvninit.bat
mkdir %1
cd %1
mvn archetype:generate -DgroupId=%2 -DartifactId=%3 -DarchetypeArchtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd %3
mvn package

