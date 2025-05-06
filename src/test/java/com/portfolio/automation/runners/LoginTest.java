package com.portfolio.automation.runners;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = "cucumber.glue", value = "com.portfolio.automation.stepdefinitions")
@ConfigurationParameter(key = "cucumber.filter.tags", value = "not @ignore")
public class LoginTest {}
