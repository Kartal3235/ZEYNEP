package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
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
    public void test(){
        //https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki
        driver.get("https://www.bestbuy.com/");
        //testleri yapin
        //○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.bestbuy.com/ com/";
        Assert.assertEquals("URL YANLIŞ",expectedUrl,actualUrl);



        //○titleTest => Sayfa başlığının “ R est” içer me diğini(contains) test edin

        //○logoTest => BestBuy logosunun görüntülen digini test edin
        //○Francais LinkTest => Fransizca Linkin görüntüle n diğini test edin
    }
    @Test
    public void test01() {
        //○titleTest => Sayfa başlığının “ R est” içer me diğini(contains) test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Best";
        Assert.assertTrue(actualTitle.contains(arananKelime));
    }
    @Test
    public void test02() {
    //○logoTest => BestBuy logosunun görüntülen digini test edin

    }

}
