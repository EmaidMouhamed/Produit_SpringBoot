## Étape de build
#FROM maven:3.8.6-openjdk-17 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests

## Étape de production avec Tomcat
#FROM tomcat:10.1-jdk21-temurin
#RUN rm -rf /usr/local/tomcat/webapps/*
#COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war
#EXPOSE 8080
#CMD ["catalina.sh", "run"]

#from chatGPT about building tomCat with the .war file already genrated
FROM tomcat:10.1-jdk21-temurin
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]