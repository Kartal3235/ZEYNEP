package handleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class C05 {

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
        //driver.quit();
    }
    @Test
    public void test01() {

        //    //1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        String ılkSayfaHandleDeger=driver.getWindowHandle();
        //    //2- Hover over Me First" kutusunun ustune gelin
        // Doğrudan Klavye veya Fare kullanmak yerine bu sınıfı kullanın.==ActionsClass==
        Actions actions=new Actions(driver);
        driver.findElement(By.xpath("//*[text()='Hover Over Me Second!']"));
        actions.click().perform();
        //    //3- Link 1" e tiklayin
        WebElement linkTıkla=driver.findElement(By.xpath("(//*[text()='Link 1'])[1]"));
        
        //    //4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //    //5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //    //6- “Click and hold" kutusuna basili tutun

        //    //7-“Click and hold" kutusunda cikan yaziyi yazdirin
        //    //8- “Double click me" butonunu cift tiklayin
    }
}
