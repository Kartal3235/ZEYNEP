package actions.excercies;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03 extends TestBase {
    @Test
    public void test03() {
        //2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
        //3. Giriş sayfasının başarıyla göründüğünü doğrulayın
        WebElement gırıssayfa=driver.findElement(By.xpath("//body"));
        Assert.assertTrue(gırıssayfa.isDisplayed());
        //4. 'Test Çalışmaları' düğmesine tıklayın
        driver.findElement(By.xpath("(//a[@href=\"/test_cases\"])[1]")).click();
        //5. Kullanıcının test çalışmaları sayfasına başarıyla yönlendirildiğini doğrulayın
        WebElement testCase=driver.findElement(By.xpath("//body"));
        Assert.assertTrue(testCase.isEnabled());
    }
}
