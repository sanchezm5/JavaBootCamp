# **Stwitter System Project**

Stwitter is a simplified social media service that allows a user to create posts, search for posts by name of the poster or an id number, and add comments to posts that have been created.

## System Design

The Stwitter service has been designed with Microservices, Feign client, a Comment Queue Consumer, Caching, Config Server and Eureka.

## Running the Program

1. Open each project in IntelliJ IDEA
2. Run the Stwitter Config Server (Port: 1999)
3. Run the Stwitter Eureka Service Registry (Port: 8761)
4. Run the Comment Service (Port: 6868)
5. Run the Post Service (Port: 1777)
6. Run the Comment Queue Consumer
7. Run the Stwitter Service (Port: 8889)
8. Test the REST API using Postman

