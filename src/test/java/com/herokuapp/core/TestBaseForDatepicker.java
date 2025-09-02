package com.herokuapp.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestBaseForDatepicker {
    protected WebDriver driver;

    @BeforeEach
    public void init() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");  // starting test without opening browser
        options.addArguments("--windows-size=900,300");
        options.addArguments("--incognito");
        options.addArguments("--disable-geolocation");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-pop-up-blocking");



        driver = new ChromeDriver(options);

        WebDriverManager.chromedriver().setup();
      //  driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void stop() {
        driver.quit();
    }
}
