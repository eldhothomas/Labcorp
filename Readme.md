# Labcorp

This is an assignment for Labcorp. Goal of the assignment is to create an application will perform the following logic -

- Write classes in Java to represent 3 different types of employees - hourly employees, Salaried employees, Salaried employee managers.
- Each employee has a property - Number of vacation days (floating point) accumulated for the work year (defined as 260 workdays). 
  It cannot be negative value and cannot be written externally. Upon creation, it is 0
- Hourly employees accumulate 10 vacation days.
- Salaried employees accumulate 15.
- Salaried employee managers accumulate 30.

Each employee has -
- getDetails() method
- work() method
- takeVacation() method 

Create 10 instances of each type of employee on startup


## History

5/18/2021  1.0.0   Started work. Created Git repository
5/18/2021  1.1.0   Created Point calculator Service
5/18/2021  1.2.0   Created REST endpoint

## REST Controllers (all GET) -

http://localhost:8080/api/employee/H001     			- Retrieve employee
http://localhost:8080/api/employee/recordWork/H001/200  - Record work days
http://localhost:8080/api/employee/takeVacation/H001/2 	- Take vacation


## Technology Highlights -

- Works with Open JDK 15 from Adopt
- SpringBoot (See version in build.gradle)
- Gradle (See version in gradle/wrapper/gradle-wrapper.properties)
- RESTController (Returns a JSON response)
- Creates Boot Jar (build target - bootJar)

## Dev Set up

gradlew eclipse  - Set up Eclipse environment. 
>IMPORTANT - DO not import as General Project.
>Import as Gradle Project into Spring TS. Add Gradle nature to project. 


## TO RUN Application

Start up using "gradlew bootRun". All environment variables are set in build.gradle.


