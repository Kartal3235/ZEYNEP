package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SoftAssertPage {
    public SoftAssertPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="user-name")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement loginButton;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement ddm;
    @FindBy(xpath = "//option[@value='lohi']")
    public WebElement lowtoHıgh;
}
