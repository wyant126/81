FROM java:8
VOLUME /tmp
ADD @project.build.finalName@.jar springboot-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springboot-docker.jar"]