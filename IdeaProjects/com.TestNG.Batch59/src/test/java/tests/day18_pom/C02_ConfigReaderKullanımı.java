package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanımı {
    @Test
    public void test01() {
        FacebookPage facebookpage=new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // cikarsa cookies kabul edin

        // kullanici mail kutusuna yanlış bir ismi yazdirin
        facebookpage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));
        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookpage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongpassword"));
        // login butonuna basin
        facebookpage.loginTusu.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookpage.girilemediYaziElementi.isDisplayed());
        //sayfayı kapatın
        Driver.closeDriver();
    }
}
