FROM java:8
EXPOSE 8080
ADD target/my-spin-jenkin-demo-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]