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

public class C04 {


    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown() {
       // driver.quit();
    }
    @Test
    public void test01() {

        //●https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaHandledeger=driver.getWindowHandle();
        System.out.println(ilkSayfaHandledeger);
        //●Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement yazınınDogrulugu=driver.findElement(By.xpath("//*[text()='Opening a new window']"));
        String actualYazı=yazınınDogrulugu.getText();
        String expectedyazı="Opening a new window";
        Assert.assertEquals(expectedyazı,actualYazı);
        //●Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(expectedTitle,actualTitle);
        //●Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        //●Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        Set<String> tumsayfalarınHandleDeger=driver.getWindowHandles();
        System.out.println(tumsayfalarınHandleDeger);
        String ikincisayfaHandledeger="";

        for (String each:tumsayfalarınHandleDeger
             ) {
            if (!each.equals(ilkSayfaHandledeger)){
                ikincisayfaHandledeger=each;
            }
        }

        System.out.println(ikincisayfaHandledeger);
        driver.switchTo().window(ikincisayfaHandledeger);
        String actualTıtle=driver.getTitle();
        String expectedTıtle="New Window";
        Assert.assertEquals(expectedTıtle,actualTıtle);

        //●Sayfadaki textin “New Window” olduğunu doğrulayın.

        WebElement ulasılanText=driver.findElement(By.xpath("//h3"));
        String acutalText=ulasılanText.getText();
        String expectedText="New Window";
        Assert.assertEquals(expectedText,acutalText);

        //●Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
        //doğrulayın.
        driver.switchTo().window(ilkSayfaHandledeger);
        String ilkBaslık=driver.getTitle();
        String istenenBaslık="The Internet";
        Assert.assertEquals(istenenBaslık,ilkBaslık);
    }


}
