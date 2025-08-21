package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.SelectPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DropDownTest extends TestBase {
    HomePage homePage;

    @BeforeEach
    public void preconditions() {
        homePage = new HomePage(driver);

    }

    @Test
    public void dropDownTest() {
        homePage.clickOnDropDownLink();
        new SelectPage(driver).
                selectAnOption("Option 1")
                .verifyAnOption();

    }

}
