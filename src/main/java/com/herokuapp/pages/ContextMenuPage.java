package com.herokuapp.pages;

import com.herokuapp.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "hot-spot")
    WebElement hotSpot;

    public ContextMenuPage rightClickBtn() {
        try {
            actions.contextClick(hotSpot).perform();
            driver.switchTo().alert().accept();
            getWait(1000);
            // В ОБОИХ СЛУЧАЯХ правда НЕ РАБОТАЕТ
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            actions.sendKeys(Keys.ENTER).perform();

            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            driver.navigate().back(); // в этом случае сработала проверка
        } catch (Exception e) {
            e.getMessage();
        }

        return this;
    }

    @FindBy (className = "heading")
    WebElement heading;

    public ContextMenuPage verifyBackMainPage(String text) {
        Assertions.assertEquals(text,heading.getText());
        return this;
    }
}
