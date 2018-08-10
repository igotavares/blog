# blog

This is a simple blog application that uses Spring Boot, H2, Spring Data JPA and Spring Rest. This application provides the services of creating, editing, searching and deleting a post.

## Requirements
* Maven
* Java 8 and up

## Usage

Application is using Maven as a dependency management system, so all required libraries should be downloaded automatically. The project use Spring Boot and H2 running in in-memory mode is used as a database. All these services are configured automatically and no action from user is required to set them up.

```
$ git clone git://github.com/igotavares/blog.git
$ cd blog/
$ mvn compile
$ cd blog-war/
$ mvn spring-boot:run
```

## Tests

Following the order of the commands below it will be possible to test the services obtaining the respective results

Testing the create post service

```
curl -H "Content-Type: application/json" --request POST -d "{\"title\":\"Welcome\",\"description\":\"to the new world\",\"publicationDate\":\"2018-01-01 00:00:00\"}"  localhost:8080/posts
```

Result

```
{"id":1}
```

Testing post search service

```
curl localhost:8080/posts
```

Result

```
[{"id":1,"title":"Welcome","description":"to the new world","publicationDate":"2018-01-01 00:00:00"}]
```

Testing the post search service by id

```
curl localhost:8080/posts/1
```

Result

```
{"id":1,"title":"Welcome","description":"to the new world","publicationDate":"2018-01-01 00:00:00"}
```

Testing the post change service

```
curl -H "Content-Type: application/json" --request PUT -d "{\"id\":1,\"title\":\"Title\",\"description\":\"Description\",\"publicationDate\":\"2019-01-01 00:00:00\"}" localhost:8080/posts/1
```

Testing the post delete service

```
curl --request DELETE  localhost:8080/posts/1
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Release History

* 1.0-SNAPSHOT
  * Work in progress
