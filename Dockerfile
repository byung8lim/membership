FROM openjdk:11

ARG TIMEZONE="Asia/Seoul"

ARG DEBIAN_FROMTEND=noninteracive
ENV TZ=Asia/Seoul
RUN apt-get install -y tzdata
RUN cp /usr/share/zoneinfo/${TIMEZONE} /etc/localtime

RUN useradd -ms /bin/bash -u 1001 byung8

RUN mkdir -p /membership/run
RUN mkdir -p /membership/logs
COPY target/membership-0.0.1-SNAPSHOT.jar /membership/app.jar
RUN chown -R byung8:byung8 /membership
USER byung8

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=prod","-Duser.timezone=Asia/Seoul","/membership/app.jar"]

