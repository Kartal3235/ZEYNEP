package Assertions_Exercies;

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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01 {
    /*
    Amazon anasayfaya gidip dropdown
    menuden books secelim
    seçtiğimiz option'i yazdıralım

    dropdown'daki opsiyonların toplam sayısının
    23 olduğunu test edelim
     */
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
        driver.get("https://www.amazon.com");
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);//Dropdown üzerinde işlem yapacaksak,select objesi oluşturmalıyız
        select.selectByVisibleText("Books");

        // Bir dropdown ile çalışıyor iken, son seçilen option'a ulaşmak isterseniz;
        // select.getFirstSelectedOption() methodunu kullanmalıyız.

        System.out.println(select.getFirstSelectedOption().getText());

        //dropdown'daki opsiyonların toplam sayısının
        //    23 olduğunu test edelim

        List<WebElement> optionList=select.getOptions();
        int optionsSayısı=optionList.size();
        int expectedSayısı=23;

        Assert.assertEquals(23,optionsSayısı);



    }
}
