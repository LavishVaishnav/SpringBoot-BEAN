# MySpringBoot-BEAN

## Overview

**MySpringBoot-BEAN** is a Spring Boot application that demonstrates building a backend system from scratch using dependency injection and bean management. The project showcases the use of Spring’s core features like configuring beans, injecting dependencies, and building an application that follows best practices for scalability and modularity.

## Project Structure

- **app/**: Contains the main application logic and configurations.
- **gradle/**: Manages dependencies and builds the project.
- **gradlew/gradlew.bat**: Scripts to run Gradle tasks without explicitly installing Gradle.
- **settings.gradle**: Contains settings for the Gradle project.

## Key Features

- **Dependency Injection**: Demonstrates Spring’s IoC container and how beans are injected into different components.
- **Bean Configuration**: Custom beans are configured in the application and wired using annotations like `@Bean`, `@Autowired`, and `@Configuration`.
- **Spring Boot**: Uses Spring Boot to streamline application setup, providing an easy-to-configure environment.

## How to Run

### Prerequisites

- **Java 17** or above installed.
- **Gradle** (or use the included wrapper `./gradlew`).
- An IDE such as **IntelliJ IDEA** or **VS Code**.

### Steps to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/MySpringBoot-BEAN.git
   cd MySpringBoot-BEAN
   ```

2. Build and run the project using Gradle:
   ```bash
   ./gradlew build
   ./gradlew bootRun
   ```

3. The application should now be running at:
   ```
   http://localhost:8080
   ```

## Examples of Dependency Injection

The application includes examples of different types of dependency injections:

- **Constructor Injection**: Preferred for mandatory dependencies.
- **Field Injection**: Quick but less testable.
- **Setter Injection**: Optional dependencies.

## Project Highlights

- **Custom Beans**: Beans are manually created and injected into other components using `@Bean` and `@Autowired`.
- **IoC Container**: Demonstrates how Spring’s IoC container manages the lifecycle of objects.
- **Configuration**: Beans are configured in the configuration classes using `@Configuration`.

## Contributing

Feel free to submit issues or pull requests if you find bugs or want to add features!


## Contact

For any inquiries, please contact **vaishnavlavish27@gmail.com**.

---
