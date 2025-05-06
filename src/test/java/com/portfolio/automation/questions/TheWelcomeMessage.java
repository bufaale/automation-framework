package com.portfolio.automation.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.Actor;

import com.portfolio.automation.ui.SecureAreaPage;

/**
 * Question that retrieves the success message displayed after login.
 *
 * 🧠 SOLID Principle - SRP (Single Responsibility Principle):
 * This class is only responsible for extracting and returning a specific piece of UI data.
 *
 * 💡 OOP - Abstraction:
 * Consumers of this class don’t need to know how the message is retrieved — only what it returns.
 *
 * 🔄 LSP (Liskov Substitution Principle):
 * This class can be replaced with any other implementation of Question<String> without breaking the test.
 */
public class TheWelcomeMessage {

    public static Question<String> text() {
        return actor -> SecureAreaPage.SUCCESS_MESSAGE.resolveFor(actor).getText().trim();
    }
}
