package tests.Excercies;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.Driver;

public class TwitterClass {
    @Test
    public void test01() {
        TwitterPage tpg=new TwitterPage();
        //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
        Driver.getDriver().get("https://www.twitter.com");
        //actions class kullanmayin twitteri deneyen instagram i denesin
        Faker faker = new Faker();
        tpg.girisButon.click();
        tpg.name.sendKeys(faker.name().firstName()+Keys.TAB+faker.phoneNumber().cellPhone()+Keys.TAB+Keys.TAB+"Ocak"+Keys.TAB+"2"+Keys.TAB+"2012"+Keys.TAB);
        tpg.nextButton.click();


    }
}