./gradlew assemble
docker build . -t example
docker run --network host example
