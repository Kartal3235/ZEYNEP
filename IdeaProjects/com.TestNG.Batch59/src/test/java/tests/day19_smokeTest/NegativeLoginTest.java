package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BrcPage brcpage=new BrcPage();

    @Test
    public void yanlısSifre() {
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcpage.loginClick.click();
        //test data user email: customer@bluerentalcars.com ,
        brcpage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        //test data password : 12345
        brcpage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tıklayın
        brcpage.ikinciLoginClick.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemediğini test et

        Assert.assertTrue(brcpage.ikinciLoginClick.isDisplayed());
        Driver.closeDriver();
    }
    // Bu class da 2 test methodu daha oluşturun
    // biri yanlısKullanıcı ismi
    // diğeride yanlışSifre


    @Test
    public void yanlısKullanıcı() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcpage.loginClick.click();
        brcpage.email.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        brcpage.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        brcpage.ikinciLoginClick.click();

        Assert.assertTrue(brcpage.ikinciLoginClick.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlıs() {
    Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    brcpage.loginClick.click();
    brcpage.password.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
    brcpage.password.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
    brcpage.ikinciLoginClick.click();

    Assert.assertTrue(brcpage.ikinciLoginClick.isDisplayed());
    Driver.closeDriver();
    }
}
