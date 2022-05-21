package file;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Fileupload1 extends TestBase {
    @Test
    public void test01() {

        //http://demo.guru99.com/test/upload/ adresine gidelim
        driver.get("http://demo.guru99.com/test/upload/");
        // dosya seç butonuna basalım
        WebElement dosyaSecButonu=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        dosyaSecButonu.click();
        //Download da bulunan bir dosyayı gönderelim
        String farklıKısım=System.getProperty("user.home");
        String ortakKısım="\\Download\\dummy(2).txt";
        String downloadDosyaYolu=farklıKısım+ortakKısım;
        dosyaSecButonu.sendKeys(downloadDosyaYolu);

        driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
        // dosyanın basarıyla yüklendiğinin test edelim.
        WebElement basarıylaYuklendi=driver.findElement(By.xpath("//button[@id='submitbutton']"));
        Assert.assertTrue(basarıylaYuklendi.isDisplayed());
    }
}
