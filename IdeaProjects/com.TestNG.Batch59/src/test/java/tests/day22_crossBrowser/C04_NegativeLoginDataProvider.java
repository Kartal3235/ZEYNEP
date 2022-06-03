package tests.day22_crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NegativeLoginDataProvider {
    BrcPage brcpage=new BrcPage();

    @DataProvider
    public static Object[][] KullanıcıListesi() {

        Object[][] kullanıcıBilgileri={{"firuze@nehaber.com","546789"},{"murat@benbuişibilirim.com","12345"}};
        return kullanıcıBilgileri;
    }

    @Test(dataProvider = "KullanıcıListesi")
    public void yanlısSifre(String useremail,String password) {

        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brcpage.loginClick.click();
        //test data user email: dataprovider dan alalaım
        brcpage.email.sendKeys(useremail);
        //test data password : dataprovider dan alalaım
        brcpage.password.sendKeys(password);
        // login butonuna tıklayın
        brcpage.ikinciLoginClick.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemediğini test et

        Assert.assertTrue(brcpage.ikinciLoginClick.isDisplayed());
        Driver.closeDriver();
    }
}
