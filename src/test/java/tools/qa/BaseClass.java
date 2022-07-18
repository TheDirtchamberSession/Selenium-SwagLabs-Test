package tools.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseClass {

    public static WebDriver driver;

    @BeforeSuite
    public void initializeWebDriver() throws IOException {

        ChromeOptions options = new ChromeOptions();
        //Add Headless Argument
        options.addArguments("headless");
        driver = new ChromeDriver(options); //Add "options" to new ChromeDriver
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}
