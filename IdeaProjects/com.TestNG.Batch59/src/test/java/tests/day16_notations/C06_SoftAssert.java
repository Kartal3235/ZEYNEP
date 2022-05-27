package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C06_SoftAssert extends TestBase {

    @Test
    public void test01() {

        /*
        Softassertion baslangıç ve bitiş satırları arasındaki
        tum assertion ları yapıp, bitiş satırına geldiğinde
        bize bulduğu tum hataları rapor eder.
         */
        //Softassert baslangıcı obje oluşturmaktır.
        SoftAssert softAssert=new SoftAssert();

        // 1-amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // 2-title'ın amazon içerdiğini test edin
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        softAssert.assertTrue(actualTitle.contains(expectedTitle),"title amazon içermiyor");
        // 3-arama kutusunun erişilebilir olduğunu test edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"arama kutusuna erişilemiyor");
        // 4-arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // 5-arama yapıldığını test edin
        WebElement sonucYazıElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYazıElementi.isDisplayed(),"arama yapılmadı");
        // 6-arama sonucunun nutella içerdiğini test edin
        softAssert.assertTrue(sonucYazıElementi.getText().contains("Nutella"),"arama sonucu Kutella içermiyor");

        // softassert'e bitis satirini soylemek icin assertAll() kullanilir
        // bu satir yazilmazsa assertion gorevi yapilmamis olur
        softAssert.assertAll();

        /*
         softassert un hata bulsa bile çalışmaya devam etme özelliği
         assertAll()'a kadardır.
         Eğer assertAll()'da failed rapor edilirse calışma durur
         ve class'ın kalan kısmı çalıştırılmaz
         (Yani assertAll hardAsserdeki her bir assert gibidir,
         hatayı yakalarsa çalışma durur.
         */
        System.out.println("assertionlardan fail olan olursa ,burası çalışmaz");
    }
}
