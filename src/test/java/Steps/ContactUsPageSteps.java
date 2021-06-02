package Steps;

import UIPages.ContactUsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ContactUsPageSteps {

    private ContactUsPage contactUsPage;
    @Step
    public void selectHeading(String value){
        String selectValue=contactUsPage.selectHeading();
        Assert.assertEquals(value,selectValue);
    }
}
