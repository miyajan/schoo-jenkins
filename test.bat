cd "%~pd0"
java -cp "lib\*;target\classes" -Dorg.schmant.task.junit4.target=target\junit_report.xml schoo.jenkins.runner.TestRunner schoo.jenkins.FizzBuzzTest
