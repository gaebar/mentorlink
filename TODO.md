# TODO – MentorLink Project

## Completed
- Created `Mentor` and `Project` entity classes
- Set up `MentorRepository` and `ProjectRepository`

## In Progress
- Implementing `MentorService` and `ProjectService`
- Designing the structure for DTOs

## Next Steps
- Create DTO classes for `Mentor` and `Project` with validation annotations (e.g., @NotBlank, @Min)
- Set up controller classes and expose endpoints
- Integrate Swagger/OpenAPI documentation
- Write unit tests for service classes
- Add integration tests for repository behavior
- Consider pagination and sorting for list endpoints
- Add exception handling using `@ControllerAdvice`

## Optional Ideas
- Add a global `ResponseWrapper` for consistent API responses
- Implement logging for service methods
- Add API versioning if needed
