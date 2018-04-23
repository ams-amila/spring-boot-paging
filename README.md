# spring-boot-paging

## How to start the application? 

> mvn spring-boot:run

Application will start on port 8080

## What are the available endpoints?

### Save a person entry

- End point : http://{host}:{port}/api/person
- Method : POST
- Payload : { "firstName" : "", "lastName" : "", "bio" : ""}

### Fetch person entries

- End point : http://{host}:{port}/api/person
- Method : GET
- Query Params :
  - page : page number to fetch ( starting from 0 )
  - size : size of the page ( number of entries per page )
  - sort : details for sorting entries ( proprty,order Ex: createdAt,DESC) 
  
  [More Details](http://ankushs92.github.io/tutorial/2016/05/03/pagination-with-spring-boot.html) 
