package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCamPage {

    public HotelMyCamPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement loginClick;
    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement username;
    @FindBy(xpath = "//input[@name='Password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement ikinciLoginClick;
    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagement;
    @FindBy(xpath = "//a[@href=\"/admin/HotelRoomAdmin\"]")
    public WebElement hotelRooms;
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addHotels;
    @FindBy(xpath = "//select[@id='IDHotel']")
    public WebElement ddm;
    @FindBy(xpath = "//input[@id='Code']")
    public WebElement code;
    @FindBy(xpath = "//input[@id='Name']")
    public WebElement name;
    @FindBy(xpath = "//input[@id='Location']")
    public WebElement location;
    @FindBy(xpath = "//div[@id='cke_1_contents']")
    public WebElement description;
    @FindBy(xpath = "//input[@id='Price']")
    public WebElement price;
    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement roomtype;
    @FindBy(xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxAdultCount;
    @FindBy(xpath = "//input[@id='MaxChildCount']")
    public WebElement maxchildCount;
    @FindBy(xpath = "//input[@id='IsAvailable']")
    public WebElement approved;
    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement save;
}
