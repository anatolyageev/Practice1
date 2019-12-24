@echo off

javac -d ..\bin ua\nure\ageev\practice1\*.java

java -cp ..\bin ua.nure.ageev.practice1.Demo

del ..\bin\ua\nure\ageev\practice1\*.class
pause