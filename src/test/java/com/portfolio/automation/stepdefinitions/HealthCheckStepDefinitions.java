package com.portfolio.automation.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.portfolio.automation.tasks.CallGetEndpoint;
import com.portfolio.automation.questions.ResponseStatusCode;

/**
 * Step definitions that map Gherkin steps to Screenplay API interactions.
 *
 * 📘 BDD (Behavior-Driven Development):
 * These methods bind natural language from the feature file to executable code.
 *
 * 🔄 DIP (Dependency Inversion Principle):
 * Uses high-level abstractions (Tasks and Questions) rather than low-level implementation details.
 *
 * 🧠 SRP:
 * Each method has a single responsibility: interpret and execute one behavior step.
 */
public class HealthCheckStepDefinitions {

    @Given("the API is available")
    public void apiIsAvailable() {
        setTheStage(new net.serenitybdd.screenplay.actors.OnlineCast());
        theActorCalled("Tester").whoCan(CallAnApi.at("https://reqres.in"));
    }

    @When("the actor sends a GET request to {string}")
    public void actorSendsGet(String endpoint) {
        theActorInTheSpotlight().attemptsTo(CallGetEndpoint.from(endpoint));
    }

    @Then("the response status code should be {int}")
    public void responseStatusCodeShouldBe(int expectedStatus) {
        int actualStatus = theActorInTheSpotlight().asksFor(ResponseStatusCode.value());
        assertThat(actualStatus, equalTo(expectedStatus));
    }
}
