FROM 6.9.2-jdk17-alpine as builder
# copy the source tree and the pom.xml to our new container
COPY ./ ./

# build
RUN gradlew build


FROM amazoncorretto:17-alpine-jdk

MAINTAINER br.dev.a2

WORKDIR /usr/src/app

COPY --from=builder target/*.jar bootcamp-project.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/bootcamp-project.jar"]


