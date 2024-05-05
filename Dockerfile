FROM openjdk:8
WORKDIR /myapp
COPY /target/springbootdemotest-0.0.1-SNAPSHOT.jar /myapp/springbootdemotest.jar
ENTRYPOINT [ "java","-jar","springbootdemotest.jar"]
