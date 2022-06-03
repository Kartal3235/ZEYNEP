package tests.day22_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;
import utilities.TestBaseCross;

public class C01_AssertionsCross extends TestBaseCross {

    @Test
    public void test01() {

        // 1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // 2-title'ın amazon içerdiğini test edin
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        // 3-arama kutusunun erişilebilir olduğunu test edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        // 4-arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // 5-arama yapıldığını test edin
        WebElement sonucYazıElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYazıElementi.isDisplayed());
        // 6-arama sonucunun nutella içerdiğini test edin
        Assert.assertTrue(sonucYazıElementi.getText().contains("Nutella"));
    }
}
