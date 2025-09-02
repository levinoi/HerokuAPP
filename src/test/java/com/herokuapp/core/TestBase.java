package com.herokuapp.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    protected WebDriver driver;
    protected ApplicationManager app = new ApplicationManager(System.getProperty("browser","chrome"));
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @BeforeEach
    public void init(TestInfo testInfo) {
         driver= app.startTest();
         logger.info("Test started ");
    }

    @AfterEach
    public void tearDown() {
        app.stopTest();
        logger.info("Test stopped");
    }

}