./gradlew assemble
docker build . -t gc-example-a
docker run --network host gc-example-a
