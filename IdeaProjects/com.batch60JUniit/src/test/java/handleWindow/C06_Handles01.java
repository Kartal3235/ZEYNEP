package handleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class C06_Handles01 {

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
        driver.quit();
    }
    @Test
    public void test01() {

        //● https://www.amazon adresine gidin.
        driver.get("https://www.amazon.com");
        String amazonHandle=driver.getWindowHandle();
        System.out.println(amazonHandle);
        //● Sayfa başlığının(title) “Amazon” içerdiğini doğrulayın.
        String amazonBaslık=driver.getTitle();
        String expectedBaslık="Amazon";
        Assert.assertTrue(amazonBaslık.contains(expectedBaslık));
        //● yeni bir tab açarak, aşağıdaki sayfaya gidin.
        driver.switchTo().newWindow(WindowType.TAB);
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String theInternetHandle=driver.getWindowHandle();
        System.out.println(theInternetHandle);
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement textDogru=driver.findElement(By.xpath("//h3"));
        String actualText=textDogru.getText();
        String exoectedText="Opening a new window";
        Assert.assertEquals(exoectedText,actualText);
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String ActualTitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(expectedTitle,ActualTitle);
        //● Click Here butonuna basın.
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

        Set<String>bilinenHadledegerler=new HashSet<>();

        bilinenHadledegerler.add(amazonHandle);
        bilinenHadledegerler.add(theInternetHandle);
        System.out.println(bilinenHadledegerler);

        Set<String> tumHandleDeger=driver.getWindowHandles();
        System.out.println(tumHandleDeger);
        String clickHandle="";
        for (String each:tumHandleDeger
             ) {
            if(!each.equals(bilinenHadledegerler)){
                 clickHandle=each;
            }
        }
        driver.switchTo().window(clickHandle);
        String actualTıtle=driver.getTitle();
        String expectedTıtle="New Window";
        Assert.assertEquals(expectedTıtle,actualTıtle);

        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        WebElement text=driver.findElement(By.xpath("(//*[text()='New Window'])[2]"));
        String yazıText=text.getText();
        String expectedYazı="New Window";
        Assert.assertEquals(expectedYazı,yazıText);
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu
        //doğrulayın.
        driver.switchTo().window(theInternetHandle);
        String baslık=driver.getTitle();
        String istenenBaslık="The Internet";
        Assert.assertEquals(istenenBaslık,baslık);
    }

}
