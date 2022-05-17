package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BetsBuy_Ornk {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
    @Test
    public void test() {
        //https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki
        driver.get("https://www.bestbuy.com/");
        //testleri yapin


    }

    @Test
    public void test01() {
        //○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin


    }
}
