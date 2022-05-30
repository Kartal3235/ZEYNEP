package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderFacebookKullanımı {
    @Test
    public void test01() {
        FacebookPage facebook=new FacebookPage();
        //facebook anasayfasına gidin
       Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // kullanıcı mail kutusuna yanlış mail yazdırın
      facebook.emailGırıs.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        // kullanıcı sifre kutusuna yanlış password yazdırın
        facebook.passwordGırıs.sendKeys(ConfigReader.getProperty("fbWrongpassword"));
        // login butonuna basın
       facebook.logınClick.click();
        // giriş yapılamadığını test edin
      Assert.assertTrue(facebook.girilemediYazıElementi.isDisplayed());
      Driver.closeDriver();
    }
}
