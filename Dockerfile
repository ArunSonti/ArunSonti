FROM openjdk:11
COPY target/*jar /usr/src/myapp/app.jar
RUN chmod 755 -R /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","./app.jar"]