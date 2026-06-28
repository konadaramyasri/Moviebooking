# Movie Booking System

## Project Overview

The Movie Booking System is a web-based application developed using Java Servlets, HTML, CSS, Oracle Database, and Apache Tomcat. It allows users to book movie tickets and perform CRUD (Create, Read, Update, and Delete) operations.

## Project Objective

The objective of this project is to develop a simple web application that manages movie ticket bookings while demonstrating database connectivity and CRUD operations using Java Servlets.

## Features

- Book a movie ticket
- View all bookings
- Edit booking details
- Update booking information
- Delete bookings
- Store booking information in Oracle Database
- User-friendly interface

## Technologies Used

- Java
- Java Servlets
- HTML
- CSS
- Oracle Database
- JDBC
- Apache Tomcat
- Eclipse IDE
- GitHub

## Project Structure

```
MovieBooking
│
├── src
│   └── main
│       ├── java
│       │   └── com.moviebooking
│       │       ├── BookticketServlet.java
│       │       ├── DBConnect.java
│       │       ├── DeleteBookingServlet.java
│       │       ├── EditBookingServlet.java
│       │       ├── UpdateBookingServlet.java
│       │       └── ViewBookingsServlet.java
│       │
│       └── webapp
│           ├── BookTicket.html
│           ├── BookingSuccess.html
│           ├── ViewBookings.html
│           ├── images
│           │   └── mb.jpeg
│           ├── META-INF
│           └── WEB-INF
```

## Software Requirements

- Java JDK
- Eclipse IDE
- Apache Tomcat 9
- Oracle Database
- Oracle JDBC Driver (ojdbc8.jar)

## How to Run

1. Clone or download the repository.
2. Import the project into Eclipse IDE.
3. Configure Apache Tomcat.
4. Add the Oracle JDBC Driver.
5. Create the required database table in Oracle.
6. Update the database connection details in `DBConnect.java`.
7. Run the project on Apache Tomcat.
8. Open the application in your browser.

## Project Modules

- Book Ticket
- View Bookings
- Update Booking
- Delete Booking

## Future Enhancements

- User Login
- Seat Selection
- Online Payment
- Email Confirmation
- Responsive User Interface

## Author

Konada Ramya Sri

B.Tech Computer Science and Engineering

