package com.herokuapp.tests.stepDefinitions;

import com.herokuapp.pages.AlertsPage;
import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.herokuapp.core.BasePage.driver;

public class LoginSteps {
    HomePage homePage;
    LoginPage login;


    @Given("User launches chrome browser")
    public void precondition() {
        homePage = new HomePage(driver);
        login = new LoginPage(driver);
    }

    @When("User opens herokuapp login page")
    public void open_loginPage() {
        new HomePage(driver).openUrl();
        //    homePage.openUrl();
    }

    @And("User enters correct data")
    public void enter_data() {
        new LoginPage(driver).enterData();
    }

    @And("User clicks on Login button")
    public void click_on_LoginBtn() {
        new LoginPage(driver).click_on_Submit_btn();
    }

//    @Then("User verifies SuccessMessage is displayed")
//    public void verify_homePage_title() {
//        new LoginPage(driver).isHomePageTitleDisplayed();
//    }
//
//    @And("User quites browser")
//
//    public void quite_browser() {
//        new LoginPage(driver).quiteBrowser();
//    }


}
