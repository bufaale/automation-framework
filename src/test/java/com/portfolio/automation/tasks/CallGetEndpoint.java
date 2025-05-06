package com.portfolio.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Task that performs a GET request to a given API endpoint.
 *
 * 🧠 SOLID Principle - SRP (Single Responsibility Principle):
 * This class is responsible for one action only — sending a GET request.
 *
 * 🔓 OCP (Open/Closed Principle):
 * The task can be extended (e.g., with headers or query params) without modifying this class.
 *
 * 🧱 OOP - Encapsulation:
 * Abstracts away the REST interaction in a single reusable and readable task.
 */
public class CallGetEndpoint implements Task {

    private final String endpoint;

    public CallGetEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public static CallGetEndpoint from(String endpoint) {
        return instrumented(CallGetEndpoint.class, endpoint);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(endpoint));
    }
}
