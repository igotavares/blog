# blog

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

```
curl -H "Content-Type: application/json" --request POST -d "{\"title\":\"Welcome\",\"description\":\"to the new world\",\"publicationDate\":\"2018-01-01 00:00:00\"}"  localhost:8080/posts/
```

```
{"id":1}
```

```
curl localhost:8080/posts/
```

```
[{"id":1,"title":"Welcome","description":"to the new world","publicationDate":"2018-01-01 00:00:00"}]
```

```
curl localhost:8080/posts/1
```

```
{"id":1,"title":"Welcome","description":"to the new world","publicationDate":"2018-01-01 00:00:00"}
```

```
curl -H "Content-Type: application/json" --request PUT -d "{\"id\":1,\"title\":\"Title\",\"description\":\"Description\",\"publicationDate\":\"2019-01-01 00:00:00\"}" localhost:8080/posts/1
```

```
{"id":1,"title":"Welcome","description":"to the new world","publicationDate":"2018-01-01 00:00:00"}
```

```
curl --request DELETE  localhost:8080/posts/1
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Release History

* 1.0-SNAPSHOT
  * Work in progress
