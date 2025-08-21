package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@src='/frame_top']")
    List<WebElement> topFrame;

    public NestedFramesPage getTopFrame() {
        System.out.println("the total numbers of frames = " + topFrame.size());
        return this;
    }


    @FindBy(xpath = "//*[@name='frame-top']")
    WebElement topFrame1;

    @FindBy(xpath = "//*[@name='frame-left']")
    WebElement leftFrame;

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramesPage switchToLeftNestedFrame() {
        driver.switchTo().frame(topFrame1);
        driver.switchTo().frame(leftFrame);
        softly.assertThat(containsText("LEFT", body));
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-middle']")
    WebElement middleFrame;

    public NestedFramesPage switchToMiddleNestedFrame() {
        driver.switchTo().frame(topFrame1);
        driver.switchTo().frame(middleFrame);
        softly.assertThat(containsText("MIDDLE", body));
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-middle']")
    WebElement rightFrame;
    public NestedFramesPage switchToRightNestedFrame() {
        driver.switchTo().frame(topFrame1);
        driver.switchTo().frame(rightFrame);
        softly.assertThat(containsText("RIGHT", body));
        return this;
    }

    @FindBy(xpath = "//*[@name='frame-bottom']")
    WebElement bottomFrame;

    public NestedFramesPage switchToBottomNestedFrame() {
        driver.switchTo().frame(bottomFrame);
        softly.assertThat(containsText("BOTTOM", body));
        return this;
    }
}
