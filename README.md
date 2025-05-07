<<<<<<< HEAD
# automation-framework
=======
# 🧪 Automation Framework: API & UI Testing with Serenity BDD + Screenplay

This project showcases a hybrid automation framework for both REST API and UI testing using:

- **Serenity BDD** with **Screenplay Pattern**
- **Rest Assured** for API testing
- **Selenium WebDriver** for UI testing
- **Cucumber + Gherkin** for BDD
- **JUnit 5**
- **Gradle**

---

## 📁 Project Structure

```
automation-framework/
├── build.gradle
├── serenity.properties
├── .gitignore
├── README.md
├── src/
│   ├── main/java/com/portfolio/automation/...  # reusable logic
│   └── test/
│       ├── java/com/portfolio/automation/
│       │   ├── runners/
│       │   ├── stepdefinitions/
│       │   ├── tasks/
│       │   ├── questions/
│       │   └── ...
│       └── resources/features/
│           └── health_check.feature
│           └── login_success.feature
```

---

## ✅ Current Functionality

✔ Functional API test for GET `/api/users/2`  
✔ UI login test with valid credentials  
✔ Screenplay-based architecture  
✔ Integration with Cucumber and Serenity  
✔ Automatic HTML report generation

---

## ▶ How to Run Tests

```bash
./gradlew clean test
```

The report will be available at:

```
target/site/serenity/index.html
```

---

## 🔖 Tags

You can tag scenarios or features with `@api` or `@ui` and run them selectively.

```java
@ConfigurationParameter(key = "cucumber.filter.tags", value = "@ui")
```

---

## 🧠 Principles Applied

| Principle       | Applied In                                 | Explanation |
|----------------|---------------------------------------------|-------------|
| **SRP**         | `LoginWithCredentials`, `CallGetEndpoint`  | Each class has a single responsibility (one actor action per task). |
| **OCP**         | `CallGetEndpoint`, `OpenLoginPage`         | Tasks are open to extension (e.g., headers) but closed to modification. |
| **LSP**         | `Task`, `Question` implementations          | Can be substituted for other Tasks/Questions without breaking functionality. |
| **ISP**         | Screenplay interfaces (Task, Question)     | Actors implement only what they need (separation of concerns). |
| **DIP**         | StepDefinitions depend on abstractions     | Do not instantiate concrete logic; rely on injected abilities/tasks. |
| **BDD**         | `.feature` files                           | Behavior is defined in natural language and connected to code. |
| **TDD**         | Tests drive development of each task       | Tasks/Questions are written to satisfy behavior in `.feature`. |
| **OOP**         | Encapsulation in PageObjects, reusability  | Code is modular and adheres to object-oriented design. |

---

## 👨‍💻 Author

**Alejandro Bufarini** — [LinkedIn](https://linkedin.com/in/alejandrobufarini)  
Senior QA Automation Engineer

---

> This repository is part of my professional portfolio.
>>>>>>> d6b12ca (📄 Add README and CI workflow for GitHub Actions)
