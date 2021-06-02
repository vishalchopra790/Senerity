package AppTests;

import Steps.LoginPageSteps;
import Steps.ContactUsPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ContactUsPageSteps contactUsPageSteps;

    @Managed(clearCookies = ClearCookiesPolicy.BeforeEachTest)
    WebDriver browser;

    @Test
    public void appLoginTest(){
        loginPageSteps.isOnLogin();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
    }
    @Test
    public void contactus(){
        loginPageSteps.isOnLogin();
        loginPageSteps.loginAsUser();
        loginPageSteps.userShouldBeLogin();
        loginPageSteps.navigateToContactUs();
        contactUsPageSteps.selectHeading("SEND A MESSAGE");
    }

}
