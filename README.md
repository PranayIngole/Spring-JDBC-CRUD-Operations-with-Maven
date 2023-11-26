# Spring-JDBC-CRUD-Operations-with-Maven
This project showcases the implementation of a simple CRUD (Create, Read, Update, Delete) application using Spring JDBC, Maven, and MySQL database. The project utilizes core Java principles to manage a database of posts.

Features: CRUD Operations: Implements Create, Read, Update, and Delete functionalities for posts. Spring JDBC: Utilizes Spring's JDBC module to interact with the MySQL database. Maven Project Structure: Organized as a Maven project, ensuring easy dependency management and build processes. MySQL Database: Utilizes a MySQL database to store and manage post-related data. GitHub Repository: Codebase is hosted on GitHub for easy access, collaboration, and version control.

Key Components: Spring JDBC Template: Implements JDBC operations using Spring's JDBC Template for efficient database interaction. Post Entity Class: Represents the structure and attributes of a post. DAO (Data Access Object) Layer: Contains methods to perform CRUD operations on the MySQL database. Controller Layer: Handles incoming requests, interacts with the DAO layer, and provides appropriate responses.

Purpose: This project serves as a foundational example demonstrating the integration of Spring JDBC with a MySQL database, offering a guide for performing basic CRUD operations on posts in a Java environment.

Usage: Clone or fork the repository from GitHub. Configure the MySQL database connection properties in the project configuration files. Build the project using Maven and run it within a suitable IDE or via command line. Access the provided endpoints to perform CRUD operations on posts.

Contributions: Contributions, suggestions, and improvements to the project via pull requests on GitHub are welcome, fostering collaboration and enhancement of the application.

Technology Stack and its version: Java(jdk-17) Spring(5.3.9) Maven MySQL(8.0.20) This project provides a solid foundation for understanding Spring JDBC while working with a MySQL database in a core Java environment.

file Structure : pom.xml: -> all project related dependencies are written in this file.
src/main/java -> cotain all Application related packages and class.
(Packages) ->application.database.connection 
(class) DbDetails -> contain database connection code.
->application.database.operations 
(classes) EmployeeRowMapper -> contain code related to fetching data form database and convert it to object from of EmployeeDetails.
Operation-> It contain all insert, update, delete and select operation related to database. 
->application.Employee.main 
(main class) Employee -> It contain all the bussiness related logic.
->employee.related.data 
(class) EmployeeDetails-> It contain all employee related data template and setter and getter method.
variables and it's type-> (int)empID, (String)fullName ,(String)address

database

create database called spring in your system.
create employee table in spring database.
make 3 column 1)Emp_ID(integer type) 2)FullName(varchar type) 3)Address(varchar type)
