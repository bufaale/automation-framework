package com.portfolio.automation.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SecureAreaPage {
    public static final Target SUCCESS_MESSAGE = Target.the("success message")
            .locatedBy(".flash.success");
}
