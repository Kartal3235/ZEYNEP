package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitifLoginTest {
    BrcPage brc=new BrcPage();
    @Test
     public void test01() {

        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brc.loginClick.click();
        //test data user email: customer@bluerentalcars.com ,
        brc.email.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        //test data password : 12345
        brc.password.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tıklayın
        brc.ikinciLoginClick.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUsername=brc.kullanıcıProfilIsmı.getText();
        String expectedUsername=ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);

        Driver.closeDriver();
    }
}
