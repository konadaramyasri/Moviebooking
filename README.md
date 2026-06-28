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
├── README.md
│
└── src
    └── main
        ├── java
        │   └── com
        │       └── moviebooking
        │           ├── Bookticketsevlet.java
        │           ├── DBConnect.java
        │           ├── DeleteBookingServlet.java
        │           ├── EditBookingServlet.java
        │           ├── UpdateBookingServlet.java
        │           └── ViewBookingsServlet.java
        │
        └── webapp
            ├── BookTicket.html
            ├── META-INF
            │   └── MANIFEST.MF
            └── WEB-INF
                ├── BookingSuccess.html
                ├── ViewBookings.html
                └── images
                    └── mb.jpeg
```

## Software Requirements

- Java JDK
- Eclipse IDE
- Apache Tomcat 9
- Oracle Database
- Oracle JDBC Driver (ojdbc8.jar)

## How to Run

1. Download the project from GitHub.
2. Import the project into Eclipse IDE.
3. Configure Apache Tomcat 9 as the target server.
4. Add the Oracle JDBC Driver (`ojdbc8.jar`) to the project's build path.
5. Create the required Oracle Database table.
6. Update the database connection details in `DBConnect.java`.
7. Deploy the project on Apache Tomcat.
8. Access the application through your web browser.
  
## Author

Konada Ramya Sri

B.Tech Computer Science and Engineering

