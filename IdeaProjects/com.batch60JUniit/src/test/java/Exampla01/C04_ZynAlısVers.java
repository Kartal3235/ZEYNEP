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
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("//input[@style='outline: none;']")).sendKeys("alagül"+Keys.ENTER);
        driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Funda Arar - Alagül (Official Video) " +
                "MEYPOM tarafından 8 yıl önce 4 dakika 14 saniye 5.033.216 görüntüleme']")).click();




    }



}
