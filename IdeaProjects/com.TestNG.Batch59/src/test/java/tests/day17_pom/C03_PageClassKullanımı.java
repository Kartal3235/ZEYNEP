package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {

    @Test
    public void test01() {
        FacebookPage facebookpage=new FacebookPage();
        // facebook anasayfaya gidin
        Driver.getDriver().get("https://www.facebook.com");
        // cookies çıkarsa kabul edin
        // kullanıcı mail kutusuna rastgele bir isim yazdırın
        Faker fake=new Faker();
        facebookpage.mailKutusu.sendKeys(fake.internet().emailAddress());
        // kullanıcı şifre kutusuna rastgele bir password yazdırın
        facebookpage.sifreKutusu.sendKeys(fake.internet().password());
        // login butonuna basın
        facebookpage.loginTusu.click();
        // giriş yapılamadığını test edin
        Assert.assertTrue(facebookpage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
