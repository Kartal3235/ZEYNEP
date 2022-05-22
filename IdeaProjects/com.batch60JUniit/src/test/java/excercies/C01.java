package excercies;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Giriş sayfasının başarıyla göründüğünü doğrulayın
        WebElement homePage=driver.findElement(By.xpath("//body"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. 'Kayıt / Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
        //5. 'Yeni Kullanıcı Kaydı!' ifadesinin görünür olduğunu doğrulayın
        WebElement kayıtGorunme=driver.findElement(By.xpath("(//h2)[3]"));
        Assert.assertTrue(kayıtGorunme.isDisplayed());
        //6. Adı ve e-posta adresini girin
        Actions action=new Actions(driver);
        Faker faker=new Faker();
        String fakeMail= faker.internet().emailAddress();
        WebElement nameClick=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        action.click(nameClick).sendKeys("abdullah").sendKeys(Keys.TAB).sendKeys(fakeMail).perform();

        //7. 'Kaydol' düğmesine tıklayın
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        //8. 'HESAP BİLGİLERİNİ GİRİN' seçeneğinin görünür olduğunu doğrulayın
        WebElement hesapBilgileri=driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(hesapBilgileri.isDisplayed());
        //9. Ayrıntıları doldurun: Unvan, İsim, E-posta, Şifre, Doğum tarihi
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        String fakePassword=faker.internet().password();

        action.click(password).sendKeys(fakePassword).sendKeys(Keys.TAB).sendKeys("1").sendKeys(Keys.TAB).sendKeys("april").sendKeys(Keys.TAB).sendKeys("2021").sendKeys(Keys.TAB).perform();
        //10. 'Bültenimize kaydolun!' onay kutusunu işaretleyin.
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        //11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu işaretleyin.
        driver.findElement(By.xpath("//*[text()='Receive special offers from our partners!']")).click();
        //12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Telefonu Numarası
        String telefonFaker= faker.phoneNumber().cellPhone();
        WebElement adClick=driver.findElement(By.xpath("//input[@id='first_name']"));
        action.click(adClick).sendKeys("abdullah").sendKeys(Keys.TAB).sendKeys("tutar").sendKeys(Keys.TAB).
                sendKeys("olgun").sendKeys(Keys.TAB).sendKeys("ankara").sendKeys(Keys.TAB).sendKeys("karşıyaka").
                sendKeys(Keys.TAB).perform();
        WebElement ddm=driver.findElement(By.xpath("//select[@id='country']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Canada");
        Thread.sleep(3000);
        WebElement state=driver.findElement(By.xpath("//input[@id='state']"));
        action.click(state).sendKeys("paris").sendKeys(Keys.TAB).sendKeys("konya").sendKeys(Keys.TAB).sendKeys("3131").
                sendKeys(Keys.TAB).sendKeys(telefonFaker).sendKeys(Keys.TAB).perform();
        Thread.sleep(3000);
        //13. 'Hesap Oluştur düğmesine' tıklayın
        driver.findElement(By.xpath("//*[text()='Create Account']")).click();
        //14. "HESAP OLUŞTURULDU!"nun görünür olduğunu doğrulayın
        WebElement hesapOlustu=driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(hesapOlustu.isDisplayed());
        //15. 'Devam' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
        //16. "Kullanıcı adı olarak oturum açtı" seçeneğinin görünür olduğunu doğrulayın
        WebElement otrumActı=driver.findElement(By.xpath("//*[text()=' Logged in as ']"));
        Assert.assertTrue(otrumActı.isDisplayed());
       /* //17. 'Hesabı Sil' düğmesine tıklayın
        driver.findElement(By.xpath("(//a[@style='color:brown;'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-danger button-form js-tooltip']")).click();
        //18. 'HESAP SİLİNDİ!' ifadesinin görünür olduğunu doğrulayın ve 'Devam' düğmesini tıklayın
        WebElement hesapSilindi=driver.findElement(By.xpath("//h1"));
        Assert.assertTrue(hesapSilindi.isDisplayed());*/
        String url=driver.getWindowHandle();
        System.out.println(url);
    }
    @Test
    public void test02(){

        ////4. 'Bize Ulaşın' düğmesine tıklayın
        //          WebElement contactUs=driver.findElement(By.xpath("//a[@href=\"/contact_us\"]"));
        //          contactUs.click();
        //        //5. 'GET IN CONTACT' ifadesinin görünür olduğunu doğrulayın
        //        //6. Ad, e-posta, konu ve mesaj girin
        //        //7. Dosya yükle
        //        //8. 'Gönder' düğmesine tıklayın
        //        //9. tık OK düğmesi
        //        //10. 'Başarılı! Bilgileriniz başarıyla gönderildi.' mesajı görüntülenir
        //        //11. 'Ana Sayfa' düğmesine tıklayın ve ana sayfaya başarıyla ulaştığını doğrulayın
    }
}
