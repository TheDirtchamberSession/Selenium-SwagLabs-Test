package tools.qa.page_object;
import org.openqa.selenium.By;
import swag.lab.test.utility.jsonFilesParser.JSONManagement;
import tools.qa.BaseClass;

import java.io.IOException;

public class QaToolsLoginPage extends BaseClass {

    By userName = By.id("userName");
    By password = By.id("password");
    By logInButton = By.id("login");

    public void typeUsername () throws IOException {
        driver.findElement(userName).sendKeys(JSONManagement.readProperty("standardUser"));
    }

    public void typePassword () throws IOException {

       driver.findElement(password).sendKeys(JSONManagement.readProperty("password"));

    }
    public void clickLogInButton ()  {
        driver.findElement(logInButton).click();

    }
}


