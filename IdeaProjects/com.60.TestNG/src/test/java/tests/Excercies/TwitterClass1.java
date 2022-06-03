package tests.Excercies;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class TwitterClass1 {
    @Test
    public void test01() {
        TwitterPage tpg=new TwitterPage();
        //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
        Driver.getDriver().get("https://www.twitter.com");
        //actions class kullanmayin twitteri deneyen instagram i denesin
        Faker faker = new Faker();
        Random rnd=new Random();
        int dropdownValuesCount=tpg.ddm.getSize().width;
        tpg.girisButon.click();
        tpg.name.sendKeys(faker.name().firstName()+Keys.TAB);
        tpg.phoneNumber.sendKeys(faker.phoneNumber().cellPhone()+Keys.TAB);
        tpg.ddm.sendKeys(ConfigReader.getProperty(String.valueOf(rnd.nextInt(dropdownValuesCount))));


    }
}
