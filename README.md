_This project was developed as part of a challenge proposed by the instructors for those who completed the course at Alura. While I created the code independently, it may resemble the work of other students who participated in the same challenge._

**The project is not intended for real-world application; it is solely to demonstrate my programming knowledge to recruiters. In this project, various techniques were showcased:**

•  Applied the Command design pattern.

•  Reduced coupling by injecting the repository into the constructors of the classes.

•  Performed various database operations with Spring Data JPA.

•  Built relationships between tables using the ORM concept of Spring Data JPA.

•  Utilized the streams feature introduced in Java 8.

•  Used Enums with constructors and their own methods.

•  Threw appropriate exceptions for the context and handled them.

•  Integrated with the ChatGPT API to obtain information about an artist.

•  Leveraged Lombok to make the code less verbose.

•  Modeled the application using Java record classes.

•  Employed the Derived Query Method and Custom Query feature of Spring Data JPA to perform database searches.

•  Utilized the Text Blocks feature introduced in Java 13.

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