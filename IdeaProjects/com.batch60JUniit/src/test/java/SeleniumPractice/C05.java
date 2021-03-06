package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
     /*
       ...Exercise5...
      ***@BeforeClass ın icerisinde driver i kuralim
      ***maximize edip tum web elementler yuklenene kadar 10 sn bekletelim
      ***Google 'a gidelim ve sayfa basliginin Google icerdigini dogrulayalim
      ***Amazon'a gidelim ve url in www.amazon.com icerip icermedigini dogrulayalim
      ***@AfterClass ta driver ı kapatalim
       */
    static WebDriver driver;
    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test(){
        driver.get("https://www.google.com");
        WebElement sonucYazısı=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        String actualYazı=sonucYazısı.getText();
        String expected="Google";
        Assert.assertTrue(actualYazı.contains(expected));

    }
    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="www.amazon.com";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}
