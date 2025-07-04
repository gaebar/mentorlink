# MentorLink

**MentorLink** is a Spring Boot–based web application that helps organizations manage their mentorship programs by assigning projects to mentors and tracking their workload.

## Inspiration

This project was inspired by my experience as a mentor and speaker in **July 2025** during a two-week summer coding camp organized by the nonprofit organization **Kode with Klossy**. The camp focused on web development and STEAM education (Science, Technology, Engineering, Arts, and Mathematics) for girls and non-binary teens aged 13 to 18.

MentorLink builds on that experience to simulate how organizations can structure and scale mentorship programs effectively.

## Features

The application allows administrators to:
- Allocate a new project to a mentor (max 3 projects per mentor)
- Retrieve mentors based on the number of projects they are mentoring
- Update the mentor assigned to a specific project
- Delete a project and automatically update the mentor’s workload

> Future enhancements will include the ability to register interns and match them to mentors based on skills and interests.

## Tech Stack

- Java 21
- Spring Boot 3.2.x
- Spring Data JPA
- MySQL
- RESTful APIs
- Jakarta Bean Validation
- Maven
- JUnit 5 & Mockito (planned)

## API Design

This application exposes REST endpoints for all major operations. It supports input validation, custom exception handling via `@ControllerAdvice`, and follows clean separation between controller, service, and repository layers.

## Status

MentorLink is currently under development. The backend structure is in place and the core features are being implemented. A frontend React interface is planned for future integration.

## Author

[Gaetano Barreca](https://github.com/gaebar)
