# api_mini_lab_3
Konopelkin Anton, 5030102/10201
## Overview
Implementation of the Restful API of the backend server, using the Spring Boot framework version 3.2.0 and Java 17. Makes requests to the [DummyJSON](https://dummyjson.com/) external API.

Postman Collection: https://api.postman.com/collections/31466013-495d33d4-0666-4456-99d6-58f21b806b2f?access_key=PMAT-01HGBT6Y0G4K3WBWNH01NN7C4F
## Prerequisites
- [Docker](https://www.docker.com/)
## Installation
### Use Docker (Recommended)
1. Launch a ready-made docker image from DockerHub:
```
docker pull antikon/api_lab_3:api_lab_3
```
2. Run docker container (e. g. at port 8080):
```
docker run -p 8080:8080 antikon/api_lab_3:api_lab_3
```
## Endpoints
- "./api/v1/products"
  - Method: GET
  - Returns a list of products
- "./api/v1/products/{id}"
  - Method: GET
  - Returns info about product with a specific id (parameter)
- "./api/v1/products/categories"
  - Method: GET
  - Returns a list of products categories
- "./api/v1/products/category/{category}"
  - Method: GET
  - Returns a list of products in a specific category (parameter)
## Testing
To test you can use Postman or web browser.
