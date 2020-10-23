### Docker build

	docker build -t dyangcht/rest-example-docker .

### Docker run and listen at 8081

	docker run --rm --name example -p 8081:8080 dyangcht/rest-example-docker

### Push to the docker hub

	docker push dyangcht/rest-example-docker


