package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "[name='username']")
    WebElement userName;

    @FindBy (css = "[name='password']")
    WebElement password;

    public LoginPage enterData() {
       type(userName,"tomsmith");
       type(password,"SuperSecretPassword!");
        return this;

    }

    @FindBy (css = "[type='submit']")
    WebElement submit;
    public void click_on_Submit_btn() {
        click(submit);
    }
}
