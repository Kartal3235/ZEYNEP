package file;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class FileUpload extends TestBase {

    @Test
    public void test() {

        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");
        //chooseFile butonuna basalim
    WebElement dosyaSecButonu=driver.findElement(By.xpath("//input[@id='file-upload']"));
    dosyaSecButonu.click();

        //Yuklemek istediginiz dosyayi sec edelim
        String farklıKısım=System.getProperty("user.home");
        String ortakKısım="\\Desktop\\text1.txt";
        String masaUstuDosyaYolu=farklıKısım+ortakKısım;

        //Dosya seç butonuna ,göndereceğimiz dosyayı send yapmamız lazım
        dosyaSecButonu.sendKeys(masaUstuDosyaYolu);

        //Upload butonuna bas alim
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();

        //6.“File Uploaded!” textinin goruntulendigini test edelim
        WebElement dosyaGöruntuTest=driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(dosyaGöruntuTest.isDisplayed());
    }

}
