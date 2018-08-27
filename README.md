# Kotlin-springboot-app

Build a Rest CRUD APIs using Kotlin, Spring Boot, JPA and Hibernate.

## Requirements

1. Java - 1.8.x

2. Gradle - 1.2.X

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/mageshrkumardev/Kotlin-springboot-app.git
```

**2. Create Mysql database**
```bash
create database feeds
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Running the App**

Type the following command in your terminal to run the app -

```bash
gradlew bootRun
```

Type the following command to build jar -
```bash
gradlew jar
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/feeds/list
    
    POST /api/feeds/save-feeds
    
    GET /api/feeds/{id}
    
    PUT /api/feeds/update-feed/{id}
    
    DELETE /api/articles/delete/{id}

You can test them using postman or any other rest client.

## Learn more

References:

<https://spring.io/guides/tutorials/spring-boot-kotlin/>
