package com.herokuapp.tests;
import com.herokuapp.core.TestBase;
import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.WindowsPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultipleWindows extends TestBase {
    HomePage homePage;
    WindowsPage winPage;

    @BeforeEach
    public void precondition() {
        homePage = new HomePage(driver);
        winPage = new WindowsPage(driver);

    }

    @Test
    public void multipleWindowsTest(){
        homePage.clickOnMultipleWindowsLink();
        winPage.clickOnNewWindowLink()
                .newTabHandle(1)
                .verifyMessage("New Window");
    }
}
