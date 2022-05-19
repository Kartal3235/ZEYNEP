package handleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class C03_Handles {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.rediff.com/");
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void test01() {


        //●https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String ılksayfaHandledeger = driver.getWindowHandle();
        System.out.println(ılksayfaHandledeger);
        //●Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement sayfaBaslık = driver.findElement(By.xpath("//h3"));
        String actualBaslık = sayfaBaslık.getText();
        Assert.assertTrue(actualBaslık.contains("Opening a new window"));
        //●Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String sayfaTitle = driver.getTitle();
        Assert.assertTrue(sayfaTitle.contains("The Internet"));
        //●Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        //●Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

        Set<String> butunSayfaWindowHandleDeger = driver.getWindowHandles();
        String ikinciSayfaWindowHandleDegeri = "";
        for (String each : butunSayfaWindowHandleDeger) {
            System.out.println(each);
            if (!each.equals(ılksayfaHandledeger)) {
                ikinciSayfaWindowHandleDegeri = each;
            }
            driver.switchTo().window(ikinciSayfaWindowHandleDegeri);

            //●Sayfadaki textin “New Window” olduğunu doğrulayın.
            //●Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
            //doğrulayın.
        }

    }
}
