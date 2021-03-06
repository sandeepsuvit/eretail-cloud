### Sample implementation of microservice using spring boot

This is a sample microservice implementation showcasing multiple services communicating via a gateway service thats running on port 8100

### Prerequisites
 - The application is designed around to run on PostgreSQL as the database so make sure you have a PostgreSQL db created with the name `eretail_cloud_db`
 - Please refer the `application-dev.properties` in `eretail-customer-service` and `eretail-management-service` for more configurations

### Steps to run
 1. First run the service registry `eretail-service-registry` which will run on port `8761`
 2. Then run the gateway `eretail-api-gateway` which will run on port `8100`
 3. Then run the customer service `eretail-customer-service`  which will run on port `9100`
 4. Then run the management service `eretail-management-service`  which will run on port `9200`
 5. Then run the infrastructure service `eretail-infrastructure-service`  which will run on port `9300`

You can see all your services up and running by visiting the following url on your browser `http://localhost:8761/`

### Endpoints
 - `http://localhost:8100/api` is the eretail api gateway endpoint
 - `http://localhost:8100/api/cs/customers` is the endpoint to access customer microservice
 - `http://localhost:8100/api/cs/customers/getAllUsers` is the endpoint to access management microservice endpoint from customer microservice (enabling microservice communication)
 - `http://localhost:8100/api/ms/management` is the endpoint to access management microservice
 - `http://localhost:8100/api/is` is the endpoint mapped for infrastructure services
 
### Sample request to register new user
 - Register new customer using `POST http://localhost:8100/api/cs/customers`
 ```json
 {
    "firstName": "Sandeep",
    "lastName": "K",
    "email": "sandeep@mail.com"
}
 ```
 
### Sample request to get all users from management
 - Fetch all registered users using `GET http://localhost:8100/api/ms/management`
 
### Api documentation
 - `http://localhost:8100/swagger-ui.html`
 
 ### Reference
 - https://dzone.com/articles/centralized-documentation-in-microservice-spring-b
 - https://programmer.help/blogs/routing-gateway-zuul-aggregating-api-documents-with-swagger-2.html
 - https://piotrminkowski.wordpress.com/2017/04/14/microservices-api-documentation-with-swagger2/
 - https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
 - https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/
