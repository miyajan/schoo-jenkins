cd "%~pd0"
mkdir target\classes
forfiles /s /m *.java /c "cmd /c echo @relpath" > target\sources.txt
javac -cp "lib\*" -d "target\classes" @target\sources.txt
