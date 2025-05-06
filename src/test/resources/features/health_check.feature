@api
Feature: Health check
  This feature validates that the API is up and responsive.

  # 📘 BDD (Behavior-Driven Development):
  # The behavior is described in a business-readable format using Gherkin syntax.

  # 🧪 TDD (Test-Driven Development):
  # This scenario can be written before implementation to guide the development of endpoint validation logic.

  Scenario: Validate GET /users/2 returns 200
    Given the API is available
    When the actor sends a GET request to "/api/users/2"
    Then the response status code should be 200
