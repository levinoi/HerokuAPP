package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement jsAlert;

    public AlertsPage clickOnFirstButton() {
        click(jsAlert);
        return this;

    }

    public AlertsPage clickApproveButton() {
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public AlertsPage verifyMessage(String text) {
        Assertions.assertTrue(containsText(text, result));
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement jsConfirm;

    public AlertsPage clickOnSecondButton() {
        click(jsConfirm);
        return this;
    }

    public AlertsPage closeAlertWithButton(String value) {
        if (value != null && value.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (value != null && value.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement jsPrompt;

    public AlertsPage clickOnThirdButton() {
        click(jsPrompt);
        return this;
    }


    public AlertsPage sendMessageToAlert(String value) {
        if (value != null) {
            driver.switchTo().alert().sendKeys(value);
            driver.switchTo().alert().accept();
        }
        return this;
    }


//    public AlertsPage verifyText(String result) {
//
//    }
}
