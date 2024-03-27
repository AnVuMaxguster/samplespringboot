#Image name: springtestsample
FROM openjdk:17.0.1-bullseye

WORKDIR /app/samplespringboot

RUN apt update && apt upgrade -y
RUN apt install -y git
RUN git clone https://github.com/AnVuMaxguster/samplespringboot.git .
RUN chmod a+x gradlew

# Unit & Coverage test
CMD ["/bin/sh", "-c", "./gradlew test jacocoTestReport --info"]