```markdown
## Spring Boot Ticket Booking Project

Welcome to the Spring Boot Ticket Booking project! This application allows users to seamlessly book tickets for various shows, cancel reservations, and retrieve insightful reports about ticket sales.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Database Schema](#database-schema)
- [API Endpoints](#api-endpoints)
- [Additional Features](#additional-features)
- [Contributing](#contributing)
- [Screenshots](#license)

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java 8 or higher**
- **STS (Preferred)**
- **Maven**
- **MySQL database**

## Getting Started

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/ticket-booking-spring-boot.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd ticket-booking-system--spring-boot
   ```

3. **Set up the Database Schema:**

The project uses the following database schema:

   - Create a MySQL database named `movie_ticket_booking_system`.
   - Add 5 columns according to this structure:
   - Columns: `id`, `show_name`, `booking_date`, `user_name`

    ![Table Columns](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/528fc88e-d33c-4ffb-b2ca-81f04a78b683)

   - Update the database configuration in `src/main/resources/application.properties` with your database credentials.

3. **Run the application:**

   ```bash
   mvn spring-boot: run
   ```

   The application will start at `http://localhost:8080`.

## Project Structure

The project structure follows best practices for a Spring Boot application:

```
ticket-booking-spring-boot/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── project/
│   │   │       ├── ticketBooking/
│   │   │       │   ├── controller/
│   │   │       │   ├── entity/
│   │   │       │   ├── repo/
│   │   │       │   └── service/
│   │   │       └── ticketBookingApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       └── templates/
│   │
│   └── test/
├── target/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
![img8](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/de313545-a209-4311-b899-2c5e72b0f015)

- `src/main/java/project/ticketBooking`: Java source files.
- `src/main/resources`: Resources such as application properties and templates.


# Technologies Used
- Spring Boot
- Html
- CSS
- Themeleaf(Basics)

## API Endpoints

- **POST /tickets/book**
  - Description: Book a ticket.
  - Request: JSON payload with `showName`, `bookingDate`, and `userName`.
  - Response: Success or error message.

- **DELETE /tickets/cancel/{ticketId}**
  - Description: Cancel a ticket.
  - Request: Path variable `ticketId`.
  - Response: Success or error message.

- **GET /tickets/reports**
  - Description: Get reports for tickets sold.
  - Response: List of booked tickets.

- **GET /tickets/available**
  - Description: Get available tickets.
  - Response: List of available tickets.

## Additional Features

- **Reducing of tickets:**
  - If existing movie is selected then its no. of tickets will be decrease by 1 each time in the db, intead of adding ame movie again.

- **Dynamic Web Interface:**
  - Intuitive and responsive UI for users to interact with the ticket booking system.

- **Real-time Reports:**
  - Visualize comprehensive reports on ticket sales and availability.

- **Error Handling:**
  - Graceful handling of errors with clear error messages.

## Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## Scrrenshots

![img1](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/4fd9ccdd-e449-46c2-b688-eb64a33bbadf)
![img2](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/daaaaa9a-e469-40d9-9eba-ebe65b29642b)
![img3](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/07525c50-a4b6-41fd-8438-91eaced34f64)
![img4](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/00641daf-5fe0-4111-8152-8c4716ea8b4e)
![img5](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/b8aff79b-3e42-49a9-8b4b-468040ba5aa9)
![img6](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/cc42eb7d-1e7c-402f-b85b-cc51afb0b845)
![img7](https://github.com/NeerajKumar805/Ticket-Booking-System-Spring-Boot/assets/69098331/f70596b6-e985-44af-b8da-e61b659a8e28)
```
