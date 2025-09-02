package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.core.TestBaseForDatepicker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DatePickerTests extends TestBaseForDatepicker {
    public static JavascriptExecutor js;
    @BeforeEach
    public void precondition(){

//        ((JavascriptExecutor) driver).executeScript(
//                "document.querySelectorAll('iframe, .google_vignette, .adsbygoogle').forEach(e => e.remove());"
//        );
    }

    @Test
    public void simpleDatePickerTest(){
           // driver.findElement(By.cssSelector
//                    ("body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"))
//                    .click();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement date = driver.findElement(By.id("datepicker"));
        date.click();
            WebElement month = driver.findElement(By.className(".ui-datepicker-month"));
            new Select(month).selectByVisibleText("August");
        driver.switchTo().defaultContent();
    }
}
