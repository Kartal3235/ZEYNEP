package TekrarTesti;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02 extends TestBase {
    @Test
    public void test01() {
        //1. "https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna "standard_user" yazdirin
        //3. Password kutusuna "secret_sauce" yazdirin
        //4. Login tusuna basin
        Actions action=new Actions(driver);
        WebElement username=driver.findElement(By.id("user-name"));
        action.click(username).sendKeys("standard_user").sendKeys(Keys.TAB).sendKeys("secret_sauce").perform();
        WebElement loginClick=driver.findElement(By.id("login-button"));
        action.click(loginClick).perform();
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        driver.findElement(By.id("item_4_title_link")).click();
        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepeteEkle=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Assert.assertTrue(sepeteEkle.isDisplayed());
        //9. Sayfayi kapatin
        driver.quit();
    }
}
