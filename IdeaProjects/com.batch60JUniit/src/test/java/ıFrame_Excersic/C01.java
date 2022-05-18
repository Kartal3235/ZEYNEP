package ıFrame_Excersic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
    public void test01(){

        //●Bir class olusturun: IframeTest 02
        //1) http://www.demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://www.demo.guru99.com/test/guru99home/");
        //2) sayfadaki iframe sayısını bulunuz.
        int iframeSayısı=driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeSayısı);

        //3)ilk iframe'deki (Youtube) play butonuna tıklayınız.
        driver.switchTo().frame(0);


        //4)ilk iframe'den çıkıp ana sayfaya dönünüz
        //5)ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live selenium project.html)
        //tıklayınız
    }
}
