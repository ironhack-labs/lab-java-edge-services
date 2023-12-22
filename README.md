![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Edge Services

## Introduction

We have just learned how to use OpenFeign for internal communication between services so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

- Update the code from the previous lab to use OpenFeign instead of Rest Template.

    ```xml
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>
    ```

- Create a new service `api-gateway` using [Spring Initializr](https://start.spring.io/) inside of your application that will act as your API gateway and add the needed routing inside of `GatewayConfiguration` file.

  This service will only need the following dependencies:

    - Spring Web
    - Eureka Discovery Client
    - Gateway
    - Lombok

<br>

**Note**: In this lab, we will use the code created in the previous lab. If you have not been able to complete it, you may ask your teacher for the solution of the previous lab so you can work with this one.