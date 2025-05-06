package com.portfolio.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_INPUT = Target.the("username input field")
            .locatedBy("#username");

    public static final Target PASSWORD_INPUT = Target.the("password input field")
            .locatedBy("#password");

    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("button[type='submit']");
}
