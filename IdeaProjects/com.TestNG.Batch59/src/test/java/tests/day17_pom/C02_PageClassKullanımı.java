package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanımı {
    @Test
    public void test01(){
        AmazonPage amazonpage=new AmazonPage();

        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // nutella aratalım
        amazonpage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //sonuc yazısının nutella içerdiğini test edelim
        String actualSonuc=amazonpage.aramaSonucElementi.getText();
        String expectedSonuc="nutella";
        Assert.assertTrue(actualSonuc.contains(expectedSonuc));
    }
}
