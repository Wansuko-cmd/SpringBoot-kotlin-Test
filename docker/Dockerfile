FROM openjdk:13

ENV APP_ROOT /app

COPY . $APP_ROOT
WORKDIR $APP_ROOT

ENTRYPOINT ["sh", "./gradlew", "bootRun"]