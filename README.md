# Bank Management System

A desktop-based Bank Management System developed using Java Swing and MySQL. This application provides basic banking operations through a graphical user interface.

## Technologies Used

- **Programming Language:** Java
- **GUI:** Java Swing
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** IntelliJ IDEA

## Features

- User Login
- New Account Registration
- PIN Management
- Balance Enquiry
- Cash Deposit
- Cash Withdrawal
- Fast Cash
- Mini Statement

## Project Structure

```text
Bank-Management-System/
├── lib/
│   ├── jcalendar-1.4.jar
│   ├── mysql-connector-j-26.10.0.jar
│   └── rs2xml.jar
├── src/
│   ├── bank/management/system/
│   └── icon/
└── .gitignore
```

## Database Configuration

1. Install MySQL Server and MySQL Workbench.
2. Create the database:

```sql
CREATE DATABASE bankSystem;
```

3. Configure your MySQL connection details locally.
4. Ensure the JDBC connection URL points to:

```text
jdbc:mysql://localhost:3306/bankSystem
```

5. Configure the database tables required by the application before running it.

**Security:** Never publish your database password or private credentials.

## How to Run

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Configure a compatible JDK.
4. Add the JAR files from the `lib` folder to the project dependencies.
5. Set up the MySQL database and required tables.
6. Configure your database credentials.
7. Run `Login.java`.

## Author

**Sanat Kumar Swain**

GitHub: [@sanatkumarswain](https://github.com/sanatkumarswain)

---

*This project was developed for learning and demonstrating Java desktop application development and database connectivity.*
