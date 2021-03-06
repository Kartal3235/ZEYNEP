package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02 {
    /*
    ...Exercise2...
    http://www.bestbuy.com 'a gidin,
    Sayfa basliginin "Best" icerdigini(contains) dogrulayin
    Ayrica Relative Locator kullanarak;
    logoTest => BestBuy logosunun gorunutulenip goruntulenmedigini dogrulayin
    mexicoLinkTest => Linkin gorunutulenip goruntulenmedigini dogrulayin
   */
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();

    }
    @Before
    public void testtenOnce(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://www.bestbuy.com");
    }
    @Test
    public void titleTest(){
        Assert.assertTrue("title best kelimesi içermiyor",driver.getTitle().contains("Best"));
    }
    @Test
    public void logotest() {
        // WebElement logoBestBuy = driver.findElement(By.xpath("//img[@class ='logo']"));
        WebElement helloHEading = driver.findElement(By.xpath("//div[@class ='heading']"));
        WebElement logoBestBuy = driver.findElement(RelativeLocator.with(By.tagName("img")).above(helloHEading));

        Assert.assertTrue(logoBestBuy.isDisplayed());
    }
    @Test
    public void mexicoLinkTest() {
    //WebElement mexicoLink=driver.findElement(By.xpath("(//img[@alt='Mexico'])[1]"));
    WebElement unitedStates=driver.findElement(By.xpath("(//img[@alt='United States'])[1]"));
    WebElement mexicoLink=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(unitedStates));
    Assert.assertTrue(mexicoLink.isDisplayed());
    }
    @After
    public void tearDown() {
       driver.close();
    }

}
