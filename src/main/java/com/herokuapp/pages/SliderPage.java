package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage {

    public SliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='range']")
    WebElement range;

    public SliderPage moveSlider() {
       getWait(1000);
        actions.dragAndDropBy(range, 45, 0).perform();
        return this;
    }

    @FindBy (id = "range")
    WebElement rangeValue;
    public SliderPage verifySliderValue(String value) {
        Assertions.assertEquals(value, rangeValue.getText());
        return this;
    }
}
