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

public class RadioButton {
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
        //https://www.facebook.com adresine gidin
       driver.get("https://www.facebook.com ");
        //Cookies’i kabul edin

        //-“Create an Account” button’una basin
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //-“radio buttons” elementlerini locate edin
        WebElement femaleButton=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        WebElement maleButton=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        WebElement customButton=driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
        //Secili degilse cinsiyet butonundan size uygun olani secin
        if(!maleButton.isSelected()){
            maleButton.click();
        }
    }


}
