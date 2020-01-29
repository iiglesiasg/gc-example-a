FROM oracle/graalvm-ce:19.3.0-java8 as graalvm
#FROM oracle/graalvm-ce:19.3.0-java11 as graalvm # For JDK 11
COPY . /home/app/simple-log
WORKDIR /home/app/simple-log
RUN gu install native-image
RUN native-image --no-server --static -cp build/libs/simple-log-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/simple-log/simple-log /app/simple-log
ENTRYPOINT ["/app/simple-log", "-Djava.library.path=/app"]
