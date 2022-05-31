package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Alert_DependsPage {
    public Alert_DependsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[@class='btn btn-default btn-lg dropdown-toggle'])[1]")
    public WebElement jsaClickMe;
    @FindBy(xpath = "//span[@id='button4']")
    public WebElement jsconBox;
    @FindBy(xpath = "//p[@id='confirm-alert-text']")
    public WebElement uyarıMesaj;
}
