package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmznPage {
    public AmznPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
