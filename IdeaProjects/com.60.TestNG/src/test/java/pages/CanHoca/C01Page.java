package pages.CanHoca;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class C01Page {
    public C01Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonePdaClick;
    @FindBy(xpath = "//h4")
    public List<WebElement> iphoneList;
    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement>addToCart;
    @FindBy(xpath = "//span[@id='cart-total']")
    public WebElement blackButton;
    @FindBy(xpath = "//tbody//tr//td[@class='text-left']")
    public List<WebElement>sepetListe;

}
