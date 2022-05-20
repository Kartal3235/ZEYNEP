package actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C06_KeybordActions1 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //https://www.facebook.com adresine gidelim
      driver.get("https://www.facebook.com");
        //Yeni hesap olustur butonuna basalim
        WebElement hesapOlustur=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        hesapOlustur.click();
        Thread.sleep(5000);
        //Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement source=driver.findElement(By.xpath("//button[@name='websubmit']"));
        WebElement target=driver.findElement(By.xpath("(//label[@class='_58mt'])[3]"));
        WebElement firstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        Actions action=new Actions(driver);
        action.click(firstName).keyDown(Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("aha"+Keys.TAB).keyDown(Keys.SHIFT).
                sendKeys("k").keyUp(Keys.TAB).sendKeys("oramaz"+Keys.TAB).sendKeys("abcd@gmail.com"+Keys.TAB).sendKeys("123456").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                moveToElement(target).click(target).perform();
        //Kaydol tusuna basalim

    }
}
