package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentACarPage {

    public RentACarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginClick;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement userMail;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginClick;
    @FindBy(xpath = "//*[text()='Jordon Stark']")
    public WebElement jordonStark;
}
