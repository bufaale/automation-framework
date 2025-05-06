package com.portfolio.automation.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Task that opens the login page in the browser.
 *
 * 🧠 SOLID Principle - SRP (Single Responsibility Principle):
 * This task does one thing only — it opens a specific URL.
 *
 * 🔓 OCP (Open/Closed Principle):
 * The task is closed for modification but open for extension, for example:
 * it could be extended to navigate through an intermediate page, or log page open events,
 * without modifying its core behavior.
 *
 * 🧱 OOP - Encapsulation:
 * The URL is hidden within a readable, reusable action, improving test readability.
 */
public class OpenLoginPage {
    public static Task open() {
        return Task.where("{0} opens the login page", Open.url("https://the-internet.herokuapp.com/login"));
    }
}
