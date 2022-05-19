package ıFrame_Excersic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
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
        driver.get("https://www.rediff.com/");
    }
    @Test
    public void test01() {

       /* //https://www.rediff.com/ adresine gidin .

        WebElement iFrameElement=driver.findElement(By.id("moneyiframe"));
        driver.switchTo().frame(iFrameElement);
        WebElement sonucNseYazısı=driver.findElement(By.xpath("//span[@id='nseindex']"));
        String actualYazı=sonucNseYazısı.getText();
        System.out.println(actualYazı);
*/
    }
    @Test
    public void test02() {
      /* WebElement degerNse=driver.findElement(By.id("moneyiframe"));
       driver.switchTo().frame(degerNse);
       WebElement actualNesDeger=driver.findElement(By.xpath("//span[@id='nseindex']"));
       String degerNs=actualNesDeger.getText();
        System.out.println(degerNs);*/
    }
    @After
    public void tearDown() {
        driver.close();
    }
}
