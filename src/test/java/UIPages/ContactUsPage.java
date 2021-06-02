package UIPages;

import net.serenitybdd.core.pages.PageObject;

public class ContactUsPage extends PageObject {

    public String selectHeading(){
       String val= $("//*[@id='center_column']/form/fieldset/h3").getText();
        System.out.println(val);
       return val;
    }
}
