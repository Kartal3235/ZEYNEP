package tests.day22_crossBrowser;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.util.Set;

public class C05_ExampleDataProvider extends TestBaseRapor {


    @DataProvider
    public static Object[][] aranacakKelimeler() {

        Object[][] aranacakKelimelerArray={{"iphone 13"},{"samsung S21"},{"nokia 13"}};

        return aranacakKelimelerArray;
    }

    @Test(dataProvider = "aranacakKelimeler")
    public void test01(String aranacakKelimeler) {
        AmazonPage amazon=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazon.aramaKutusu.sendKeys(aranacakKelimeler+ Keys.ENTER);
    }

    @Test
    public void test02(){

        //1."http://webdriveruniversity.com/" adresine gidin
        extentTest=extentReports.createTest("university test","university testte başarılı sonuç aldık");
        Driver.getDriver().get("http://webdriveruniversity.com/");
        String anasayfaya=Driver.getDriver().getTitle();
        //2."Login Portal" a kadar asagi inin
        extentTest.info("login sayfasına inildi");
        WebElement logınPortal=Driver.getDriver().findElement(By.xpath("(//div[@class='section-title'])[2]"));
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",logınPortal);
        //3."Login Portal" a tiklayin
        extentTest.info("login giriş yapıldı");
        jse.executeScript("arguments[0].click();",logınPortal);

        //4.Diger window'a gecin
        extentTest.info("yeni window sayfasına geçildi");
        String ilkHandle=Driver.getDriver().getWindowHandle();
        String ikinciHandle="";
        Set<String> tumHandleDeger=Driver.getDriver().getWindowHandles();
        System.out.println(tumHandleDeger);
        System.out.println(ilkHandle);

        for (String each:tumHandleDeger
             ) {
            if(!each.equals(tumHandleDeger)){
                ikinciHandle=each;
            }
        }System.out.println(ikinciHandle);

        //5."username" ve "password" kutularina deger yazdirin
        extentTest.info("username ve password değerleri yazıldı");
        Driver.getDriver().switchTo().window(ikinciHandle);
        Faker fake=new Faker();
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
        username.sendKeys(fake.name().username());
        WebElement pwd=Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        pwd.sendKeys(fake.internet().password());

        //6."login" butonuna basin
        extentTest.info("login butonuna basıldı");
        WebElement loginClick=Driver.getDriver().findElement(By.id("login-button"));
        loginClick.click();
        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        extentTest.info("alert yazısındaki uyarı test edildi");
        String actualYazı=Driver.getDriver().switchTo().alert().getText();
        String expectedYazı="validation failed";
        Assert.assertEquals(actualYazı,expectedYazı);
        //8.Ok diyerek Popup'i kapatin
        extentTest.info("alert kapatıldı");
        Driver.getDriver().switchTo().alert().accept();
        //9.Ilk sayfaya geri donun
        extentTest.info("anasayfaya dönüldü");
        Driver.getDriver().switchTo().window(ilkHandle);
        //10.Ilk sayfaya donuldugunu test edin
        extentTest.info("anasayfaya dönüş testi yapıldı");
        extentReports.flush();
        String anasayfaTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(anasayfaya,anasayfaTitle);
        Driver.closeDriver();
    }
}
