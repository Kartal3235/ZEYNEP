package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ReactPage {
    public ReactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//p[@class='sc-124al1g-4 eeXMBo']")
    public List<WebElement> tumElementList;
    @FindBy(xpath = "//p[@class='sc-124al1g-6 ljgnQL']")
    public List<WebElement>urunFiyatı;
    @FindBy(xpath="//button[@class='sc-124al1g-0 jCsgpZ']")
    public List<WebElement>addToCart;

}
