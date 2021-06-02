package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage login;
    @Step
    public void isOnLogin(){
        login.open();
    }
    @Step
    public void loginAsUser(){
        login.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertEquals("MY ACCOUNT", login.accountPageIsVisible());
    }
    @Step
    public void navigateToContactUs(){
        login.navigateToContactsPage();
    }
}
