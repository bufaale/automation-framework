package com.portfolio.automation.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.portfolio.automation.tasks.OpenLoginPage;
import com.portfolio.automation.tasks.LoginWithCredentials;
import com.portfolio.automation.questions.TheWelcomeMessage;

import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Managed;

/**
 * Step definitions that bind Gherkin steps to Screenplay actions and questions.
 *
 * 📘 BDD (Behavior-Driven Development):
 * These methods implement natural language steps from the feature file.
 *
 * 🔄 DIP (Dependency Inversion Principle):
 * This class depends on abstractions (Tasks and Questions), not implementations.
 * We do not instantiate browser drivers or logic directly; instead, we inject abilities like BrowseTheWeb.
 *
 * 🧠 SRP:
 * Each step handles exactly one mapping from Gherkin to code.
 */
public class LoginStepDefinitions {

    @Managed
    WebDriver browser;

    @Given("the user opens the login page")
    public void openLoginPage() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("User").can(BrowseTheWeb.with(browser));
        theActorInTheSpotlight().attemptsTo(OpenLoginPage.open());
    }

    @When("the user logs in with username {string} and password {string}")
    public void loginWithCredentials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(LoginWithCredentials.using(username, password));
    }

    @Then("the welcome message should be {string}")
    public void verifyWelcomeMessage(String expectedMessage) {
        String actualMessage = theActorInTheSpotlight().asksFor(TheWelcomeMessage.text());
        assertThat(actualMessage, containsString(expectedMessage));
    }
}
