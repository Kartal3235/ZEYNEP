package tests.Excercies.Shop;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ScholasticPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class ScholasticClass  extends TestBaseRapor{

    @Test
    public void test01() {
        ScholasticPage socp=new ScholasticPage();
        extentTest=extentReports.createTest("test01","sayfaya kayıt yapıldı");
        //open shop.scholastic.com
        extentTest.info("scholastic adresine gidildi");
        Driver.getDriver().get("https://shop.scholastic.com");
        //hover over profile icon top right of screen and click register
        extentTest.info("profil sayfasına gidildi");
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(socp.profil).perform();
        action.click(socp.register).perform();
        ReusableMethods.waitFor(5);
        //enter valid name and email address then click next
        //enter valid password, click box then click next
        extentTest.info("name,email adres girildi");
        Faker faker = new Faker();
        Driver.getDriver().switchTo().frame(socp.iframeElement);
        action.click(socp.firstName).sendKeys(socp.firstName,faker.name().firstName()).perform();
        socp.lastName.sendKeys(faker.name().lastName());
        socp.email.sendKeys(faker.internet().emailAddress()+ Keys.TAB);
        socp.nextBu.click();
        Driver.getDriver().switchTo().parentFrame();
        // select "parent" then click next
        //Click "skip this step"
        //click "contıune" buton
        //hover over/click profil icon
    }
}
