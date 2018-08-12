# Customer Relationship Management

Web Application which stores information of each customer along with the items they possess. 
It is also responsible for registration of the customers and deletion of any customer entries.

## Technology Stack
 * HTML5
 * CSS3
 * JavaScript
 * Bootstrap
 * Java
 * Spring Framework
 * Hibernate
 * MySQL
 * ThymeLeaf
 * Git
 * Intellij IDEA
 * Gradle
 
 
## Getting Started

Since the project leverages spring boot, a dedicated server is not required for deployment and gradle handles almost all of the dependencies. Therefore, only installation required is Java, MySQL community Server and Gradle.

### Prerequisites

* Java Development Kit
* MySQL Community Server
* Gradle

Note: The following file should be populated with MySQL connection properties.
```$xslt
src
 └─resources
    └─ application.properties
```

Use the following command to build the project

```$xslt
gradle build
```

### Deployment

#####Option 1: Deploy the JAR file directly

Once the build is complete, the deployable jar file is located at:

```
build
 └─libs
    └─ gs-serving-web-content-0.1.0.jar
```

Use the following command to run the application:

```
java -jar build/libs/gs-serving-web-content-0.1.0.jar
```

#####Option 2: Run the project from Intellij IDEA

1. Open the project using Intellij IDEA
2. Set the main class as mvc.Application in the configuration
3. Run the Application

Note: Make sure that MySQL Community server is up and running while the project is being deployed.
Also, before running the project, make sure port 8080 is not already in use.

## Accessing the Application

Access the following URL in your web browser: 
```
http://localhost:8080/
```

## Description

Additional description detailing the usage of each module will be added soon.



