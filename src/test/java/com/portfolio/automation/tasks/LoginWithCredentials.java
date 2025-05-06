package com.portfolio.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.portfolio.automation.ui.LoginPage;

/**
 * Task that models the user login action with valid credentials.
 *
 * 🧠 SOLID Principle - SRP (Single Responsibility Principle):
 * This class encapsulates a single action: performing a login via the UI.
 *
 * 🧱 OOP - Encapsulation:
 * Internal behavior (Enter/Click) is hidden behind a reusable, descriptive task.
 *
 * 🔁 Reusability:
 * Can be reused in any scenario that involves UI login with different credentials.
 */
public class LoginWithCredentials implements Task {

    private final String username;
    private final String password;

    public LoginWithCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginWithCredentials using(String username, String password) {
        return instrumented(LoginWithCredentials.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_INPUT),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
