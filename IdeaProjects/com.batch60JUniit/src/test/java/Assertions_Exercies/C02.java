package Assertions_Exercies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C02 {
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
       // driver.close();
    }
    @Test
    public void test() {
        //●https://the internet.herokuapp.com/dropdown adresine gidin.
       driver.get("https://the-internet.herokuapp.com/dropdown");
        //Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement ddm=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın

        select.selectByValue("2");//Valuye değeri String olarak giriyoruz
        System.out.println(select.getFirstSelectedOption().getText());

        //Visible Text (Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        //4.Tüm dropdown optionları yazdırın
        List<WebElement> tumOptions=select.getOptions();
        for (WebElement each:tumOptions
             ) {
            System.out.println(each.getText());
        }

        //5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda
        int dropDownBoyut=tumOptions.size();
        if (dropDownBoyut==4) System.out.println("True");
          else System.out.println("False");
        //True , degilse
        //False yazdırın
    }
}
