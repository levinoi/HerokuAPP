package com.herokuapp.tests;

import com.herokuapp.core.TestBase;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.SliderPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SliderTest extends TestBase {
    HomePage homePage;

    @BeforeEach
    public void preconditions() {
        homePage = new HomePage(driver);
        homePage.clickOnSliderLint();

    }

    @Test
    public void sliderTest() {
        new SliderPage(driver).moveSlider()
                .verifySliderValue("4.5");

    }
}
