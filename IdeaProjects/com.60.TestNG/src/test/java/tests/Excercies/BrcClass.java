package tests.Excercies;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class BrcClass {
    BrcPage brc=new BrcPage();
    @Test
    public void test01() {
        // Bir test method olustur positiveLoginTest()
        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //      login butonuna bas
        brc.loginClick.click();
        //test data user email: customer@bluerentalcars.com ,
        brc.userName.sendKeys(ConfigReader.getProperty("brcemail"));
        //test data password : 12345
        brc.password.sendKeys(ConfigReader.getProperty("brcpassword"));
        // login butonuna tıklayın
        brc.ikinciLoginClick.click();
        //Degerleri girildiginde sayfaya basarili sekilde girildiğini test et

        Assert.assertTrue(brc.jordonStark.isDisplayed());
    }

    @Test(dependsOnMethods = "test01")
    public void rentAcar() throws InterruptedException {
        Faker faker=new Faker();
        Random rnd=new Random();
        Select select=new Select(brc.ddm);
        select.selectByIndex(rnd.nextInt(10));
        Thread.sleep(3000);
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(brc.pıckUp).sendKeys(ConfigReader.getProperty("New Jersey")).perform();
        action.moveToElement(brc.dropOff).sendKeys(ConfigReader.getProperty("Texas")).perform();
        action.moveToElement(brc.pıckUpDate).sendKeys(ConfigReader.getProperty(faker.date().birthday().toString())).perform();
        brc.pıckUpTime.sendKeys(ConfigReader.getProperty("15:12"));
        brc.dropOffDate.sendKeys(faker.backToTheFuture().date());
        brc.dropOffTime.sendKeys(ConfigReader.getProperty("20:12"));
        brc.reservatıon.click();
    }
}
