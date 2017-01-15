cd %~pd0
rd /s /q %~pd0target %~pd0WEB-INF\classes
mkdir %~pd0target\classes
dir /s /B *.java > %~pd0target\sources.txt
javac -cp "%~pd0lib\*" -d %~pd0/target\classes @sources.txt
