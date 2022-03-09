FROM tomcat:9.0.56-jdk17-openjdk

COPY frontend/target/tasks.war /usr/local/tomcat/webapps/tasks.war