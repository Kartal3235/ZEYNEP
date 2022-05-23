package actions.excercies;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;
import java.util.stream.Collectors;

public class C04 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1."http://webdriveruniversity.com/" adresine gidin
        driver.get("http://webdriveruniversity.com/");
        String ilkHandle=driver.getWindowHandle();
        System.out.println(ilkHandle);
        String ilkSayfaUrl=driver.getCurrentUrl();
        // 2."Login Portal" a kadar asagi inin
        WebElement logınPortal=driver.findElement(By.xpath("//a[@id='login-portal']"));
        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN);
        // 3."Login Portal" a tiklayin
        logınPortal.click();
        Thread.sleep(5000);
        //4.Diger window'a gecin
        Set<String> tumHandle=driver.getWindowHandles();
        System.out.println(tumHandle.stream().map(t -> t.toString()).collect(Collectors.toList()));
        String ikinciHandle="";
        for (String each:tumHandle
             ) {
            if(!each.equals(ilkHandle)){
                ikinciHandle=each;
            }
        }
        driver.switchTo().window(ikinciHandle);
        String ikinciSayfaUrl=driver.getCurrentUrl();
        //    5."username" ve "password" kutularina deger yazdirin
        Faker fake=new Faker();
        String usernameFake=fake.name().username();
        String passwordfake=fake.internet().password();
        WebElement usernameClick=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        action.click(usernameClick).sendKeys(usernameFake).sendKeys(Keys.TAB).sendKeys(passwordfake).perform();
        //    6."login" butonuna basin
        WebElement logınClick=driver.findElement(By.xpath("//button[@id='login-button']"));
        action.moveToElement(logınClick).doubleClick().perform();

        //7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String uyarıYazı=driver.switchTo().alert().getText();
        String expectedYazı="validation failed";
        Assert.assertEquals(expectedYazı,uyarıYazı);
        //    8.Ok diyerek Popup'i kapatin
        driver.switchTo().alert().accept();
        //9.Ilk sayfaya geri donun
        driver.switchTo().window(ilkHandle);
        String ılkSayfaUrl=driver.getCurrentUrl();
        Thread.sleep(2000);
        //    10.Ilk sayfaya donuldugunu test edin
        Assert.assertEquals(ikinciSayfaUrl,ılkSayfaUrl);

    }
}
