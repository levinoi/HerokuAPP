package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/javascript_alerts']")
    WebElement element;

    public AlertsPage getAlertsWindow() {
        click(element);
        return new AlertsPage(driver);

    }

    @FindBy(xpath = "//*[@href='/windows']")
    WebElement windows;

    public WindowsPage clickOnMultipleWindowsLink() {
        click(windows);
        return new WindowsPage(driver);
    }


    @FindBy(xpath = "//*[@href='/nested_frames']")
    WebElement nestedFrames;

    public NestedFramesPage clickOnNestedFramesLink() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//*[@href='/dropdown']")
    WebElement dropdown;

    public SelectPage clickOnDropDownLink() {
        click(dropdown);
        return new SelectPage(driver);
    }

    @FindBy(xpath = "//*[@href='/horizontal_slider']")
    WebElement slider;
    public SliderPage clickOnSliderLint() {
        click(slider);
        return  new SliderPage(driver);
    }
}
