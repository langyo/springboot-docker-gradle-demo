FROM gradle:7.5.1-jdk17

COPY ./src /app/src
COPY ./build.gradle /app
COPY ./settings.gradle /app

WORKDIR /app
ARG SERVER_PORT=3000
EXPOSE ${SERVER_PORT}
RUN gradle --refresh-dependencies
RUN gradle build
CMD ["gradle", "bootRun"]
