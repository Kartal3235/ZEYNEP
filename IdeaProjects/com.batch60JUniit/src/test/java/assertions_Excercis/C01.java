package assertions_Excercis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01 {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test() throws InterruptedException {

        //1.“https://www.hepsiburada.com/” Adresine gidin
        driver.get("https://www.hepsiburada.com/");
        //2.Basliginin “ Turkiye’nin En Buyuk Alisveris Sitesi " icerdigini dogrulayin
        String actualTitle=driver.getTitle();
        String expectedTitle="Türkiye’nin En Büyük Alişveriş Sitesi";
        //Assert.assertTrue(actualTitle.contains(expectedTitle));
        Thread.sleep(3000);
        //3.search kutusuna araba yazip arattirin
        driver.findElement(By.xpath("//input[@class='desktopOldAutosuggestTheme-input']")).sendKeys("araba"+ Keys.ENTER);
        //4.bulunan sonuc sayisini yazdirin
        WebElement sonucSayısı=driver.findElement(By.xpath("//div[@class='searchResultSummaryBar-mainText']"));
        String actualYazı=sonucSayısı.getText();
        String []arr=actualYazı.split(" ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[3]);
        //5.sonuc yazisinin "araba" icerdigini dogrulayin
        Assert.assertTrue(actualYazı.contains("araba"));
        //6.Sonuc yazisinin “oto” kelimesi icermedigini dogrulayin
        Assert.assertTrue(actualYazı.contains("oto"));
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
