FROM gradle:7.5.1-jdk11 as builder

COPY build.gradle .
COPY --chown=gradle:gradle .  /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build --no-daemon



FROM eclipse-temurin:11

MAINTAINER br.dev.a2

WORKDIR /usr/src/app

COPY --from=builder /home/gradle/src/build/libs/bootcamp-project-0.0.1-SNAPSHOT.jar /app/bootcamp-project-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/bootcamp-project-0.0.1-SNAPSHOT.jar"]


