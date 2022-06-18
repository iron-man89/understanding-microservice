# understanding-microservice
As a java developer, I have decided to create a spring-boot based project to demonstrate the microservice architecture in a very simple way.
At the time of creating this repo, I am currently working on Telecom domain, so the inspiration for the entities used in this project might reflect the same.

## how to run
- run mvn clean install in all the modules (e.g. api-gateway, discount-data, tariff-data and eureka-server)
- run the services (I prefer to run the eureka server first :nerd_face: )
- go to browser and hit [here](http://localhost:8999/tariffdata/12)

![understanding microservices](https://user-images.githubusercontent.com/69397328/174430474-2f1cb8c3-0dbf-49d3-b81c-6c9c1c1eb7ab.svg)
