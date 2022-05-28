package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//input[@id='email']")
    public WebElement emailGırıs;
    @FindBy(xpath="//input[@id='pass']")
    public WebElement passwordGırıs;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement logınClick;
    @FindBy(className="_9ay7")
    public WebElement girilemediYazıElementi;


}
