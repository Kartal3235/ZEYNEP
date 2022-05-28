package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MotelPage;
import utilities.Driver;

public class C04_Motelclass {


    @Test
    public void test01(){

        MotelPage motelpage=new MotelPage();

        //https://www.hotelmycamp.com/
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //login butonuna bas
        motelpage.loginClick.click();
        //test data username:manager
        motelpage.usernameClick.sendKeys("manager");
        //test data password :Manager1!
        motelpage.passwordClick.sendKeys("Manager1!");
        motelpage.loginGiris.click();
       //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(motelpage.sonucYazıElementi.isDisplayed());
        Driver.closeDriver();


    }

}
