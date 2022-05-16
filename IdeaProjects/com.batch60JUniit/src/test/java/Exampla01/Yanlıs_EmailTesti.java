package Exampla01;

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

public class Yanlıs_EmailTesti {
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

        //http://automationpractice.com/index.php sayfasina gidelim
        driver.get("http://automationpractice.com/index.php");
        //Sign in butonuna basalim
        driver.findElement(By.xpath("//a[@class='login']")).click();
        //Email kutusuna @isareti olmayan bir mail yazip enter’a
        //bastigimizda “Invalid email address” uyarisi ciktigini test edelim
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("abcd.com"+ Keys.ENTER);
        WebElement ınvalidEmail=driver.findElement(By.xpath("//div[@id='create_account_error']"));
        Assert.assertTrue(ınvalidEmail.isDisplayed());


    }



}
