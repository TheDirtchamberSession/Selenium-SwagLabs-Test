package tools.qa.page_object;
import org.openqa.selenium.By;
import tools.qa.BaseClass;

public class QaToolsLoginPage extends BaseClass {

    By userName = By.id("userName");
    By password = By.id("password");
    By logInButton = By.id("login");

    public void typeUsername (){
        driver.findElement(userName).sendKeys("testthebest");
    }

    public void typePassword () {

       driver.findElement(password).sendKeys("tester123!");

    }
    public void clickLogInButton ()  {
        driver.findElement(logInButton).click();

    }
}


