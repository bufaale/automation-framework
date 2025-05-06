@ui
Feature: Login Success
  This feature verifies that a user can log in using valid credentials.

  # 📘 BDD (Behavior-Driven Development):
  # Describes the expected behavior of the application in user-friendly language.
  # Maps directly to Screenplay steps for clarity and maintainability.

  # 🧪 TDD (Test-Driven Development):
  # This scenario can be used as a test-first specification to drive UI login logic.

  Scenario: User logs in with valid credentials
    Given the user opens the login page
    When the user logs in with username "tomsmith" and password "SuperSecretPassword!"
    Then the welcome message should be "You logged into a secure area!"
