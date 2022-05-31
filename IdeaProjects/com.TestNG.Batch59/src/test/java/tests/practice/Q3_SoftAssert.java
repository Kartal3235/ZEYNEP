package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.sauceDemoPage;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_SoftAssert extends TestBase {

    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */


    // Verify item prices are sorted from low to high with hard Assert


    @Test
    public void sauceDemosoft() {
        sauceDemoPage sauce=new sauceDemoPage();
       Driver.getDriver().get("https://www.saucedemo.com/");
       sauce.userName.sendKeys("standard_user");
       sauce.password.sendKeys("secret_sauce");
       sauce.login.click();
       Select select=new Select(sauce.ddm);
        select.selectByIndex(2);
       ArrayList<Double>fiyatlar=new ArrayList<>();
        for (WebElement each: sauce.urunler
             ) {
           // String fiyatStr=each.getText().replaceAll("$","");
            String fiyatStr=each.getText().replaceAll("^\\D","");
            fiyatlar.add(Double.parseDouble(fiyatStr));
        }
        ArrayList<Double>kontrolListe=new ArrayList<>();
        Collections.sort(kontrolListe);
        Assert.assertEquals(kontrolListe,fiyatlar);

    }

    @Test
    public void sauceDemoHard() {
        sauceDemoPage sauce=new sauceDemoPage();
        Driver.getDriver().get("https://www.saucedemo.com/");
        sauce.userName.sendKeys("standard_user");
        sauce.password.sendKeys("secret_sauce");
        sauce.login.click();
        Select select=new Select(sauce.ddm);
        select.selectByVisibleText("Price (low to high)");

        String expected="PRICE (LOW TO HIGH)";
        String actual=select.getFirstSelectedOption().getText();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actual,expected);
    }
}
