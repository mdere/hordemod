setup:
	./gradlew setupDecompWorkspace
client:
	./gradlew runClient --stacktrace
dist:
	./gradlew build