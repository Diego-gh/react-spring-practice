# Getting Started

## Running the Project

To run this Spring Boot project, you can use the [Spring Boot Dashboard](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-spring-boot) extension in Visual Studio Code:

1. Install the Spring Boot Dashboard extension from the VS Code marketplace.
2. Open the project folder in VS Code.
3. Click on the Spring Boot Dashboard icon in the Activity Bar.
4. Locate your project in the dashboard and click the "Run" button to run the application.

This will start the API server locally.

The API will be available at [http://localhost:8080](http://localhost:8080).

## Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.0/maven-plugin)
- [Create an OCI image](https://docs.spring.io/spring-boot/4.0.0/maven-plugin/build-image.html)
- [Spring Web](https://docs.spring.io/spring-boot/4.0.0/reference/web/servlet.html)

## Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.
