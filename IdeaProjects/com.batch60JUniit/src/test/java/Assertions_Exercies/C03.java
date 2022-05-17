package Assertions_Exercies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
    public void test() {
        //1.http://zero.webappsecurity .com Adresine gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Sign in butonuna basin
        driver.findElement(By.xpath("//i[@class='icon-signin']")).click();
        //3. Login kutusuna “username” yazin
        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");
        //4. Password kutusuna “password.” yazin
        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
        //5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.navigate().back();
        //6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        //7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        //a-dropdown locate edeceğiz
        WebElement ddm=driver.findElement(By.xpath("//select[@id='pc_currency']"));
        //b-select objesi oluituracaz;
        Select select=new Select(ddm);
        //c-daha sonra dropdown daki optionslardan bir tanesini seçecez
        select.selectByVisibleText("Eurozone (euro)");
        //9. “amount” kutusuna bir sayi girin
        driver.findElement(By.xpath("//input[@id='pc_amount']")).sendKeys("500");
        //10. “US Dollars” in secilmedigini test edin
        driver.findElement(By.xpath("//input[@id='pc_inDollars_true']")).click();
        WebElement usDolar=driver.findElement(By.xpath("//input[@id='pc_inDollars_true']"));
        Assert.assertTrue(usDolar.isSelected());
        //11. “Selected currency” butonunu secin
        driver.findElement(By.xpath("//input[@id='pc_inDollars_false']")).click();
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.xpath("//input[@id='pc_calculate_costs']")).click();
        driver.findElement(By.xpath("//input[@id='purchase_cash']")).click();
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
        WebElement sonucYazısı=driver.findElement(By.xpath("//*[text()='Foreign currency cash was successfully purchased.']"));
        Assert.assertTrue(sonucYazısı.isDisplayed());
    }
}
