package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assertionc_Ornk {

    //Bir class oluşturun: Youtube Assertions

    //https://www.youtube.com adresine gidin

    //Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin

    //titleTest => Sayfa başlığının YouTube ” oldugunu test edin

    //imageTest => YouTube resminin görüntülendiğini isDisplayed()) test edin

    //Search Box 'in erisilebilir oldugunu test edin (isEnabled())

    //wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     WebDriver driver;

     @Before
     public void setUp(){
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     }
     @After
    public void tearDown() {
         driver.close();
     }
     @Test
    public void test01() {

         //https://www.youtube.com adresine gidin

         driver.get("https://www.youtube.com");
         //Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
         //titleTest => Sayfa başlığının YouTube ” oldugunu test edin
        String actualtitleTest=driver.getTitle();
        String expectedTitle="YouTube";
         Assert.assertEquals("başlık istenenden farklı",expectedTitle,actualtitleTest);
         //imageTest => YouTube resminin görüntülendiğini isDisplayed()) test edin
        WebElement ımage=driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-logo'])[1]"));
        Assert.assertTrue(ımage.isDisplayed());

     //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
         WebElement searchBoxEnable= (WebElement) driver.findElements(By.xpath("(//input[@placeholder='Ara'])[1]"));
         Assert.assertTrue(searchBoxEnable.isEnabled());
        Assert.assertTrue("youtube", Boolean.parseBoolean(driver.getTitle()));

     }

}


