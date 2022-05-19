package handleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_HandleWindows {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.rediff.com/");
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test01() {

        // 1- Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");
        String amazonHandle=driver.getWindowHandle();
        String ılkSayfaUrl=driver.getCurrentUrl();
        // 2- url'nin amazon içerdiğini tespit edelim
        Assert.assertTrue(ılkSayfaUrl.contains("amazon"));
        // 3- yeni bir pencere acıp BestBuy ana sayfasına gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bestBuyHandle=driver.getWindowHandle();
        // 4- title'ın Best Buy içerdiğini test edelim
        String bestBuyTitle=driver.getTitle();
        Assert.assertTrue(bestBuyTitle.contains("Best Buy"));
        // 5- ilk sayfaya dönup sayfada java aratalım
        driver.switchTo().window(amazonHandle);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java"+ Keys.ENTER);
        // 6- arama sonuclarının java içerdiğini test edelim
        WebElement javaSonuc=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualJavaSonuc=javaSonuc.getText();
        Assert.assertTrue(actualJavaSonuc.contains("Java"));
        // 7- yeniden bestbuy'in açık olduğu sayfaya gidelim
        driver.switchTo().window(bestBuyHandle);
        // 8- logo'nun göründüğünü test edelim
        WebElement logo=driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());
    }
}
