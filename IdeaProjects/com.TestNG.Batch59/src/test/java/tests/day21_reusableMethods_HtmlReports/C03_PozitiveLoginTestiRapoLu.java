package tests.day21_reusableMethods_HtmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C03_PozitiveLoginTestiRapoLu extends TestBaseRapor {
    BrcPage brc=new BrcPage();
    @Test
    public void test01() {

        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //      login butonuna bas
        brc.loginClick.click();
        extentTest.info("Login butonuna tıklandı");
        //test data user email: customer@bluerentalcars.com ,
        brc.email.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("Geçerli emal yazıldı");
        //test data password : 12345
        brc.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("Geçerli password yazıldı");
        // login butonuna tıklayın
        brc.ikinciLoginClick.click();
        extentTest.info("İkinci login tıklandı");
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUsername=brc.kullanıcıProfilIsmı.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.pass("Kullanıcı basarılı sekilde giriş yaptı");
        Driver.closeDriver();

    }
}
