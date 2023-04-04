run-dist:
./build/install/app/bin/app

lint:
	./gradlew checkstyleMain

build: lint
	./gradlew clean build

install: lint
	./gradlew clean install

run: run-dist

check-updates:
	./gradlew dependencyUpdates
