package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectPage extends BasePage {
    public SelectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "dropdown")
    WebElement dropdown;

    public SelectPage selectAnOption(String value) {
        new Select(dropdown).selectByVisibleText(value);
        return this;
    }

    public SelectPage verifyAnOption() {
        String firstSelectedOption = new Select(dropdown).getFirstSelectedOption().getText();
        Assertions.assertTrue(shouldHaveText(dropdown, firstSelectedOption, 5));
        return this;
    }
}
