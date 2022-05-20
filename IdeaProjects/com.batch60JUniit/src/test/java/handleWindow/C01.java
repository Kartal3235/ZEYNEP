package handleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01 {
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
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
        String windowHandle=driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());
        //  CWindow-5E4F5879E113B0D1404BDF4D90E96A92==> bu kod acılan sayfanın hash değeridir.
        //  Selenium syfalar arası geçişte bu window handle değerini kullanır.
        //
        //  driver.switchTo().window("CDwindow-5E4F5879E113B0D1404BDF4D90E96A92") bu sayfanın
        //  hash değerini girerek bu sayfaya geçiş yapmış oluyoruz
        // nutella için arama yapalım
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella"+ Keys.ENTER);

        // ilk urunun resmini tıklayarak farklı bir tab olarak açın
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella"+ Keys.ENTER);
        WebElement ılkUrunResmı=driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-square-aspect']"));
        ılkUrunResmı.click();

        /* yeni tab'da açılan urunun baslığını yazdırın */

        WebElement urununBaslıkYazdır=driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']"));
        String actualBaslıkYazdır=urununBaslıkYazdır.getText();
        String[]arr=actualBaslıkYazdır.split(" ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println(driver.getCurrentUrl());

        // ilk sayfaya geçip Url yazdıralım.
        driver.switchTo().window(windowHandle);
        String ılkSayfaUrl=driver.getCurrentUrl();
        System.out.println(ılkSayfaUrl);

    }
}