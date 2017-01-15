cd "%~pd0"
mkdir WEB-INF\classes
xcopy /s /e target\classes WEB-INF\classes
jar -cf target/schoo-jenkins.war *
