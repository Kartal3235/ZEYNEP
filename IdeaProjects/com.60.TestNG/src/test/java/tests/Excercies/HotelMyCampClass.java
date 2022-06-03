package tests.Excercies;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCamPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class HotelMyCampClass {

    @Test
    public void test01() throws InterruptedException {

        HotelMyCamPage hmcp=new HotelMyCamPage();

        //3.https://www.hotelmycamp.com adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("hcmpUrl"));
        //4. Username textbox ve password metin kutularını locate edin ve aşağıdaki verileri girin.
        //a. Username: manager b. Password : Manager 1
        hmcp.loginClick.click();
        hmcp.username.sendKeys(ConfigReader.getProperty("hcmpUsername"));

        hmcp.password.sendKeys(ConfigReader.getProperty("hcmpPassword"));

        //5. Login butonuna tıklayın.
        hmcp.ikinciLoginClick.click();
        //6. Hotel Management menusunden Add Hotelroom butonuna tıklayın.
        hmcp.hotelManagement.click();
        hmcp.hotelRooms.click();
        hmcp.addHotels.click();
        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Select select = new Select(hmcp.ddm);
        List<WebElement> tumListOge=select.getOptions();
        Random rnd=new Random();
        Faker faker = new Faker();
        int rndmCount=faker.random().nextInt(tumListOge.size());
        select.selectByIndex(rndmCount);//select hotel secildi
        Actions action=new Actions(Driver.getDriver());
        action.moveToElement(hmcp.code).click();
        action.moveToElement(hmcp.code).sendKeys(hmcp.code,"A-404").perform();
        action.moveToElement(hmcp.name).sendKeys(hmcp.name,"Okyanus").perform();
        action.moveToElement(hmcp.location).sendKeys(hmcp.location,"Sisam Adası").perform();
        action.moveToElement(hmcp.description).sendKeys(hmcp.description,"belirli bir ücret karşılığında yolcu ve turistlere konaklama ve yemek hizmeti veren tesis.").perform();

        hmcp.price.sendKeys(ConfigReader.getProperty("hmcpPrice"));
        Select select1=new Select(hmcp.roomtype);
        Thread.sleep(3000);
        List<WebElement>roomType=select1.getOptions();
        int roomTypeCount=faker.random().nextInt(roomType.size());
        select1.selectByIndex(roomTypeCount);
        action.moveToElement(hmcp.maxAdultCount).sendKeys(hmcp.maxchildCount,"45").perform();
        action.moveToElement(hmcp.maxchildCount).sendKeys(hmcp.maxchildCount,"12").perform();

        hmcp.approved.click();

        //8. Save butonuna basin.
        hmcp.save.click();
        //9. “HotelRoom was inserted successfully” textinin göründüğünü test edin.
        //10. OK butonuna tıklayın.
        //11. Hotel rooms linkine tıklayın.
        //12. "LIST OF HOTELROOMS" textinin göründüğünü doğrulayın..
    }
}
