package tests.day17_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {
    @Test
    public void test() {

    FacebookPage facebookpage = new FacebookPage();
    Faker fake = new Faker();
    //facebook anasayfasına gidin
    Driver.getDriver().get("https://www.facebook.com");
    // kullanıcı mail kutusuna rastgele mail yazdırın
        facebookpage.emailGırıs.sendKeys(fake.internet().emailAddress());
    // kullanıcı sifre kutusuna rastgele password yazdırın
        facebookpage.passwordGırıs.sendKeys(fake.internet().password());
    // login butonuna basın
        facebookpage.logınClick.click();
    // giriş yapılamadığını test edin
        facebookpage.girilemediYazıElementi.isDisplayed();
        Assert.assertTrue(facebookpage.girilemediYazıElementi.isDisplayed());
        Driver.closeDriver();
  }
}
