package com.portfolio.automation.runners;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.portfolio.automation.stepdefinitions")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-report.html")
public class HealthCheckTest {}
