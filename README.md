_This project was developed as part of a challenge proposed by the instructors for those who completed the course at
Alura. Although I created the code, it may be similar to that of other students who participated in the same challenge._

**The project is not intended for real-world application; it is solely to demonstrate my programming knowledge to
recruiters. In this project, I was able to showcase various techniques:**
- I applied the Command design pattern

- I reduced coupling by injecting the repository into the constructors of the classes

- I performed various database operations with Spring Data JPA

-  I built relationships between tables using the ORM concept of Spring Data JPA

-  I utilized the streams feature introduced in Java 8

-  I used Enums with constructors and their own methods

-  I threw appropriate exceptions for the context and handled them

-  I integrated with the ChatGPT API to obtain information about an artist

-  I used Lombok to make the code less verbose

-  I used Java record classes to model the application

-  I used the Derived Query Method and Custom Query feature of Spring Data JPA to perform database searches

-  I used the Text Blocks feature introduced in Java 13**

## Technologies I used to build this project:
[![](https://img.icons8.com/fluency/48/java-coffee-cup-logo.png)](https://www.java.com/en/)[![](https://img.icons8.com/color/48/spring-logo.png)](https://spring.io/)[![](https://img.icons8.com/ios/50/maven-ios.png)](https://maven.apache.org/)[![](https://img.icons8.com/fluency/48/intellij-idea.png)](https://www.jetbrains.com/pt-br/idea/)[![](https://img.icons8.com/color/48/postgreesql.png)](https://www.postgresql.org/)[![](https://img.icons8.com/glyph-neue/50/github.png)](https://github.com/)[![](https://img.icons8.com/ios-filled/50/chatgpt.png)](https://openai.com/index/chatgpt/)

## Before running the application:

• Install JRE or JDK

• Install Maven

• Install a Postgres database manager

• Create a database

• Create the environment variables in Windows:

• **DB_HOST** - name of the machine that will run the project

• **DB_INFO_MUSIC** - name of the database you created

• **DB_USER** - name of the user to log into your database

• **DB_PASSWORD** - password to log into your database

```
git clone https://github.com/M41k0n-Mk/info-musicos.git

cd info-musicos

mvn spring-boot:run
```