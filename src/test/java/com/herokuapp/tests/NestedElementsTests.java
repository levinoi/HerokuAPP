package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.NestedFramesPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedElementsTests extends TestBase {
    HomePage homePage;


    @BeforeEach
    public void preconditions() {
        homePage = new HomePage(driver);

    }

    @Test
    public void firstFrameTest() {
        homePage.clickOnNestedFramesLink();
        new NestedFramesPage(driver).getTopFrame()
                .switchToLeftNestedFrame();

    }

    @Test
    public void secondFrameTest(){
        homePage.clickOnNestedFramesLink();
        new NestedFramesPage(driver).switchToMiddleNestedFrame();

    }

    @Test
    public void thirdFrameTest(){
        homePage.clickOnNestedFramesLink();
        new NestedFramesPage(driver).switchToRightNestedFrame();

    }

    @Test
    public void bottomFrameTest(){
        homePage.clickOnNestedFramesLink();
        new NestedFramesPage(driver).switchToBottomNestedFrame();

    }
}
