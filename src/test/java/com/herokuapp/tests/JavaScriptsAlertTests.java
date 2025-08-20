package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaScriptsAlertTests extends TestBase {

    HomePage homePage;
    AlertsPage alertsPage;

    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        alertsPage = new AlertsPage(driver);

    }

    @Test
    public void jsAlertTest() {
        homePage.getAlertsWindow();
        alertsPage.clickOnFirstButton()
                .clickApproveButton()
                .verifyMessage("You successfully clicked an alert");

    }

    @Test
    public void jsConfirmTest() {
        homePage.getAlertsWindow();
        alertsPage.clickOnSecondButton()
                .clickApproveButton()
                .closeAlertWithButton("Ok")
                .verifyMessage("Ok");
    }

    @Test
    public void jsPromptTest(){
        homePage.getAlertsWindow();
        alertsPage.clickOnThirdButton()
                .sendMessageToAlert("Life is great!")
                .verifyMessage("Life is great!");
    }

    @AfterEach ()
    public void tearDown(){
        stop();
    }

}
