package excercies;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.awt.*;

public class C02 extends TestBase {
    @Test
    public void test02() throws InterruptedException {
    //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
    //3. Giriş sayfasının başarıyla göründüğünü doğrulayın
        WebElement gırısSayfa=driver.findElement(By.xpath("//body"));
        Assert.assertTrue(gırısSayfa.isDisplayed());
    //4. 'Bize Ulaşın' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@href=\"/contact_us\"]")).click();
    //5. 'GET IN CONTACT' ifadesinin görünür olduğunu doğrulayın
        WebElement getInContact=driver.findElement(By.xpath("(//h2)[2]"));
        Assert.assertTrue(getInContact.isDisplayed());
        Thread.sleep(3000);
    //6. Ad, e-posta, konu ve mesaj girin
        Actions action=new Actions(driver);
        WebElement nameClick=driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
        action.click(nameClick).sendKeys("bahadır").sendKeys(Keys.TAB).sendKeys("bkork1maz@gmail.com").sendKeys(Keys.TAB).sendKeys("bilinmiyor").
                sendKeys(Keys.TAB).sendKeys("test amaçlıdır").sendKeys(Keys.TAB).perform();

    //7. Dosya yükle
        WebElement secButonu=driver.findElement(By.xpath("//input[@name='upload_file']"));
        String farklıKısım=System.getProperty("user.home");
        String ortakKısım="\\Desktop\\text1.txt";
        String yuklenecekDosya=farklıKısım+ortakKısım;
        secButonu.sendKeys(yuklenecekDosya);
        Thread.sleep(3000);
    //8. 'Gönder' düğmesine tıklayın
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    //9. tık OK düğmesi
        driver.switchTo().alert().accept();
    //10. 'Başarılı! Bilgileriniz başarıyla gönderildi.' mesajı görüntülenir
        WebElement bilgiBasarı=driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        Assert.assertTrue(bilgiBasarı.isDisplayed());
    //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla ulaştığını doğrulayın
        driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
        WebElement anasayfa=driver.findElement(By.xpath("//body"));
        Assert.assertTrue(anasayfa.isDisplayed());

    }
}
