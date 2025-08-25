package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.ContextMenuPage;
import com.herokuapp.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContextMenuTest extends TestBase {
    HomePage homePage;

    @BeforeEach
    public void preconditions() {
        homePage = new HomePage(driver);

    }

    @Test
    public void RightClickBtnTest(){
        homePage.clickOnContextMenu();
        new ContextMenuPage(driver).rightClickBtn()
                .verifyBackMainPage("Welcome to the-internet");
    }
}
