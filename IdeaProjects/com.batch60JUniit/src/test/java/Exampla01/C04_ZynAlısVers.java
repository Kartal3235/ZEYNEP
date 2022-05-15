package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ZynAlısVers {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        //driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.trendyol.com");
        driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys("tesettür tunik"+ Keys.ENTER);
        driver.findElement(By.xpath("(//button[@class='color-options withCoupon'])[13]")).click();
        driver.findElement(By.xpath("//div[@class='selected sp-itm']")).click();
        driver.findElement(By.xpath("//div[@class='add-to-basket-button-text']")).click();



    }



}
