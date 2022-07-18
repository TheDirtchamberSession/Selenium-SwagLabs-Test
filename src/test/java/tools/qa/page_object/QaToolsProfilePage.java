package tools.qa.page_object;
import org.openqa.selenium.By;
import tools.qa.BaseClass;

public class QaToolsProfilePage extends BaseClass {

    By profileText = By.xpath("//div[contains(text(),'Profile')]");

    public void verifyProfileTextIsPresent () {

        driver.findElement(profileText).isDisplayed();
    }

}


