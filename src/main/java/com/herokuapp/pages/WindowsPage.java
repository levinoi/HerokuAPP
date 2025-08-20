package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage {
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath ="//*[@href='/windows/new']")
    WebElement newWindow;

    public WindowsPage clickOnNewWindowLink() {
        click(newWindow);
        return this;
    }
    @FindBy (className = "example")
    WebElement example;

    public void verifyMessage(String text) {
        Assertions.assertTrue(containsText(text, example));

    }

    public WindowsPage newTabHandle(int index) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }
}
