package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
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
        //driver.close();
    }
    @Test
    public void test01() {
        driver.get("https://www.youtube.com");
       driver.findElement(By.xpath("(//input[@name='search_query'])[1]")).sendKeys("palladıo");
        driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
        driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-moving-thumbnail-renderer'])[1]")).click();
    }
}
