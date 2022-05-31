package tests.Excercies;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Alert_DependsPage;
import utilities.Driver;

public class Alert_DependsClass {
    @Test
    public void test01() {
        Alert_DependsPage adec= new Alert_DependsPage();

     //// 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     //Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
     //// 2. CLICK ME of JavaScript Alert e tıklayın
     //adec.jsaClickMe.click();
     //// 3. pop up text i alın
     //Driver.getDriver().switchTo().alert().getText();

     //// 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     //String actualUyarıYazı=Driver.getDriver().switchTo().alert().getText();
     //String expectedUyarıYazı="I am an alert box!";
     //Assert.assertEquals(actualUyarıYazı,expectedUyarıYazı);
     //// 5. pop up i kabul edin
      //  Driver.getDriver().switchTo().alert().accept();
        // Yine ayni class da baska test methodu olusturun
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
        adec.jsconBox.click();
        // 3.  pop up text i alın
        Driver.getDriver().switchTo().alert().getText();
        // 4. Mesajın "Press a button!" olduğunu doğrulayın
        String actualMesaj= Driver.getDriver().switchTo().alert().getText();
        String expectedMesaj="Press a button!";
        Assert.assertEquals(actualMesaj,expectedMesaj);
        // 5. Açılır pencereyi kapat
        // 6. pop up i iptal edin,
        Driver.getDriver().switchTo().alert().dismiss();
        // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
        Assert.assertTrue(adec.uyarıMesaj.isDisplayed());
        // 8. alert1'e göre dependsOnMethods kullanın
    }
}
