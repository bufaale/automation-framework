package com.portfolio.automation.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Question;

/**
 * Question that retrieves the HTTP status code of the last API response.
 *
 * 🧠 SOLID Principle - SRP (Single Responsibility Principle):
 * This class handles only one concern: extracting the status code from the last response.
 *
 * 🔄 LSP (Liskov Substitution Principle):
 * This implementation can be replaced by any other Question<Integer> without breaking the test logic.
 *
 * 🧱 OOP - Abstraction:
 * Test steps rely on the question’s return value, not on how the status code is retrieved internally.
 */
public class ResponseStatusCode {

    public static Question<Integer> value() {
        return actor -> SerenityRest.lastResponse().statusCode();
    }
}
