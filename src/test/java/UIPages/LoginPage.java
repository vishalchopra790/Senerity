package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin(){
        $("#email").sendKeys("coloroxad01@gmail.com");
        $("#passwd").sendKeys("Vishal@18");
        $("#SubmitLogin").click();
    }

    public String accountPageIsVisible(){
        return $("div#center_column h1").getText();
    }

    public void navigateToContactsPage(){
        $("#contact-link").click();
    }
}
