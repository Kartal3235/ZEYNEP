package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginClick;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement ikinciLoginClick;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement jordonStark;
    @FindBy(xpath = "//select[@name='car']")
    public WebElement ddm;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pıckUp;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOff;
    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pıckUpDate;
    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pıckUpTime;

    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath = "dropOffTime")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement reservatıon;
}
