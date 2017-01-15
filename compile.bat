cd "%~pd0"
mkdir "%~pd0target\classes"
dir /s /B *.java > "%~pd0target\sources.txt"
javac -cp "%~pd0lib\*" -d "%~pd0target\classes" "@%~pd0target\sources.txt"
