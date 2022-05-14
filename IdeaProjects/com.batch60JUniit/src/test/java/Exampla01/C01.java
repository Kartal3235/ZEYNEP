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
import java.util.Arrays;

public class C01 {
    ////1 C01_TekrarTesti isimli bir class olusturun
    //    //2 https://www.google.com/ adresine gidin
    //    //3 cookies uyarisini kabul ederek kapatin
    //    //4 Sayfa basliginin “Google” ifadesi icerdigini test edin
    //    //5 Arama cubuguna “Nutella” yazip aratin
    //    //6 Bulunan sonuc sayisini yazdirin
    //    //7 sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    //    //8 Sayfayi kapatin
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After public void tearDown() {
        //driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://www.google.com/");

        //4 Sayfa basliginin “Google” ifadesi icerdigini test edin
        String baslık=driver.getTitle();
        String aranacakdeger="Google";
        if(baslık.contains(aranacakdeger)){
            System.out.println("baslık testi passed");
        }else {
            System.out.println("baslık testi failed");
        }
//5 Arama cubuguna “Nutella” yazip aratin
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Nutella");
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
//6 Bulunan sonuc sayisini yazdirin
        String arr =driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println(arr);





    }



}
