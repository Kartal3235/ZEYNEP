package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Gruru99Page {
    public Gruru99Page() {
PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='button button-orange'])[5]")
    public WebElement bankButon;
    @FindBy(xpath= "//div[@id='shoppingCart1']")
    public WebElement debitAccount;
    @FindBy(xpath = "(//a[@class='button button-orange'])[6]")
    public WebElement sales;
    @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement creditAccount;
    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement besBın;
    @FindBy(xpath = "(//div[@class='ui-widget-content'])[3]")
    public WebElement debitAmount;
    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement ıkıncıBesBın;
    @FindBy(xpath = "(//div[@id='shoppingCart4'])[2]")
    public WebElement creditAmount;
    @FindBy(xpath = "(//a[@class='button button-green'])[1]")
    public WebElement perfectGorundu;

}
