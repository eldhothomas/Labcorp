# Labcorp

This is an assignment for Labcorp. Goal of the assignment is to create an application will perform the following logic -

- Write classes in Java to represent 3 different types of employees - hourly employees, Salaried employees, Salaried employee managers.
- Each employee has a property - Number of vacation days (floating point) accumulated for the work year (defined as 260 workdays). 
  It cannot be negative value and cannot be written externally. Upon creation, it is 0
- Hourly employees accumulate 10 vacation days.
- Salaried employees accumulate 15.
- Salaried employee managers accumulate 30.

Each employee has -
- work() method
- takeVacation() method 

Create 10 instances of each type of employee on startup


## History

5/18/2021  1.0.0   Started work. Created Git repository
5/18/2021  1.1.0   Created Point calculator Service
5/18/2021  1.2.0   Created REST endpoint

## Technology Highlights -

- Works with Open JDK 15 from Adopt
- SpringBoot (See version in build.gradle)
- Gradle (See version in gradle/wrapper/gradle-wrapper.properties)
- RESTController (Returns a JSON response)
- Creates Boot Jar (build target - bootJar)

## Issues

## Gradle tasks

gradlew eclipse  - Set up Eclipse environment. 
>IMPORTANT - DO not import as General Project.
>Import as Gradle Project into Spring TS. Add Gradle nature to project. 

gradlew bootRun  - Spin up the application in a Tomcat server. 

gradlew bootJar - Create a FAT JAR in C:\Temp\Builds\labcorp\libs directory. 
>This JAR will have embedded app server

## application.yml

- Listener Port Number is given by server.port

## TO RUN Application

### To Run on Command Prompt

Start up using "gradlew bootRun". All environment variables are set in build.gradle.

### To Run in STS/Eclipse

Right-Click on application and run as Spring Boot App
On Run-Configuration, add these VM arguments - 
>-DLOG4J_LEVEL=info -DLOG4J_PATH=C:/Temp/Logs/labcorp -Dspring.profiles.active=desktop

### To Run the Fat Jar (Created by gradlew bootJar)

java -DLOG4J_LEVEL=info -DLOG4J_PATH=C:/Temp/Logs/labcorp -Dspring.profiles.active=<profile> -jar <projectName>-?.?.?.jar   
*where profile is the spring profile from application.yml*  
Note - System properties (-D) must be supplied before the JAR file on this command line.


## When the application is up

## Service Endpoints and operations

Port and Context-Path (/) are in application.yml for each env

### REST Controllers

http://localhost:8080/api/employee/H001     			- Retrieve employee
http://localhost:8080/api/employee/recordWork/H001/200  - Record work days
http://localhost:8080/api/employee/takeVacation/H001/2 	- Take vacation

## Actuator Endpoints

http://localhost:8080/actuator/health  
http://localhost:8080/actuator/info  
