package tests.Excercies;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SoftAssertPage;
import utilities.Driver;

public class C03_SoftassertClass {
    @Test
    public void test01() throws InterruptedException {
        SoftAssert soft=new SoftAssert();

        SoftAssertPage sage=new SoftAssertPage();
       //  https://www.saucedemo.com/'a gidin
        Driver.getDriver().get(" https://www.saucedemo.com/");
       //* Kullanıcı adını standard_user olarak girin
        sage.userName.sendKeys("standard_user"+ Keys.ENTER);
        Thread.sleep(3000);
       //* Şifreyi secret_sauce olarak girin
        sage.password.sendKeys("secret_sauce"+Keys.ENTER);
       //* Giriş butonuna tıklayın
        sage.loginButton.click();
       //* T1: Yumuşak Assert ile düşükten yükseğe fiyat seçin
        Select select =new Select(sage.ddm);
        select.selectByVisibleText(sage.lowtoHıgh.getText());

       //* T2: Sert Assert ile ürün fiyatlarının düşükten yükseğe doğru sıralandığını doğrulayın
        soft.assertTrue(sage.lowtoHıgh.isDisplayed());
        soft.assertAll();
        Driver.closeDriver();

    }
}
