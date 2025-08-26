package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id ="file-upload")
    WebElement upload;

    public FileUploadPage uploadFile(String path) {
        upload.sendKeys(path);
        return this;
    }

    @FindBy (css = "#file-submit")
    WebElement submit;
    @FindBy (className = "example")
    WebElement result;

    public FileUploadPage submitAndCheck(String text) {
      click(submit);
    //  getWait(1000);
        System.out.println(result.getText());
        Assertions.assertTrue(containsText(text,result));
        return this;
    }


}
