package com.herokuapp.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ApplicationManager {
    protected WebDriver driver;
    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;

    }

    public WebDriver startTest() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.safaridriver().setup();
        WebDriverManager.firefoxdriver().setup();

        switch (browser) {
            case("chrome") -> driver = new ChromeDriver();
            case("safari") -> driver = new SafariDriver();
            case("firefox") -> driver = new FirefoxDriver();
        }

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    public void stopTest() {
        driver.quit();
    }

}
