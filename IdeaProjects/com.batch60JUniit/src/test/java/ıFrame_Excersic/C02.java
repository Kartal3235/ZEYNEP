package ıFrame_Excersic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01() {

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        //2) sayfadaki iframe sayısını bulunuz.
        int iframeSayısı=driver.findElements(By.tagName("iframe")).size();

        System.out.println("iframe sayısı: "+iframeSayısı);

        //ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iFrameElement=driver.findElement(By.id("a077aa5e"));
        driver.switchTo().frame(iFrameElement);

        //ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().parentFrame();

        //ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live selenium project.html)
        //tıklayınız
    }
}
