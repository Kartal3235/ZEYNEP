package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ScholasticPage {
    public ScholasticPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='aso-navigation__profile-icon']")
    public WebElement profil;
    @FindBy(xpath = "//a[@class='sch-global-register']")
    public WebElement register;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//button[@class='mysch-btn mysch-reg-btn btn-nxt btn-next-nav sch-btn-short']")
    public WebElement nextBu;
    @FindBy(xpath = "//iframe[@id='GB_frame']")
    public WebElement iframeElement;
}
