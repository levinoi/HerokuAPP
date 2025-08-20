package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy (xpath = "//*[@href='/javascript_alerts']")
    WebElement element;

    public AlertsPage getAlertsWindow(){
        click(element);
        return new AlertsPage(driver);

    }

    @FindBy (xpath = "//*[@href='/windows']")
    WebElement windows;

    public WindowsPage clickOnMultipleWindowsLink() {
        click(windows);
        return new WindowsPage(driver);
    }
}
