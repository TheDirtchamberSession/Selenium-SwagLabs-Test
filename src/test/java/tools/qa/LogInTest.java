package tools.qa;
import org.testng.annotations.Test;
import tools.qa.page_object.QaToolsLoginPage;
import tools.qa.page_object.QaToolsProfilePage;

import java.io.IOException;


public class LogInTest extends BaseClass{

    @Test (priority = 1, description = "User Log in")
    public void logIn() throws IOException {

        QaToolsLoginPage login = new QaToolsLoginPage();
        login.typeUsername();
        login.typePassword();
        login.clickLogInButton();

        QaToolsProfilePage profilePage = new QaToolsProfilePage();
        profilePage.verifyProfileTextIsPresent();

    }
}

