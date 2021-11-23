setup:
	./gradlew setupDecompWorkspace
setupVscode:
	./gradlew genVSCodeRuns
client:
	./gradlew runClient --stacktrace
dist:
	./gradlew build