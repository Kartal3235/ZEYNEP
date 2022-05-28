package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MotelPage {

    public MotelPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Log in']")
    public WebElement loginClick;

    @FindBy(xpath="//input[@id='UserName']")
    public WebElement usernameClick;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordClick;

    @FindBy(id="btnSubmit")
    public WebElement loginGiris;

    @FindBy(xpath = "(//*[text()='ListOfUsers'])[2]")
    public WebElement sonucYazıElementi;
}
