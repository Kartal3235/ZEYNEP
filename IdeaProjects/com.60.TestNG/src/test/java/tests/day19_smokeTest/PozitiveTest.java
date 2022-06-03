package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RentACarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PozitiveTest {
    RentACarPage rent=new RentACarPage();
    @Test
    public void test01() {

        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        rent.loginClick.click();

        //test data user email: customer@bluerentalcars.com ,
        rent.userMail.sendKeys(ConfigReader.getProperty("brcemail"));
        //test data password : 12345
        rent.password.sendKeys(ConfigReader.getProperty("brcpassword"));
        // login butonuna tıklayın
        rent.ikinciLoginClick.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualText=rent.jordonStark.getText();
        String expectedText=rent.ikinciLoginClick.getText();


    }
}
