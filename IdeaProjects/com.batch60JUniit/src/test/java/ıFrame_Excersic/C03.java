package ıFrame_Excersic;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
         //1. “http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        driver.get("http://webdriveruniversity.com/IFrame/index.html");
        Thread.sleep(3000);
        //2. “Our Products” butonuna basin

        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@id='frame']"));
        driver.switchTo().frame(iframeElement);
        Actions action =new Actions(driver);
        WebElement ourPruducts=driver.findElement(By.xpath("//a[@href=\"products.html\"]"));
        action.moveToElement(ourPruducts).doubleClick().perform();
        //3. “Cameras product”i tiklayin
        WebElement camerasProduct=driver.findElement(By.xpath("//img[@id='camera-img']"));
        action.moveToElement(camerasProduct).doubleClick().perform();
        //4. Popup mesajini yazdirin
        WebElement popMesajYazdır=driver.findElement(By.xpath("//*[text()='Please Note: All orders must be over the value of £50, adding additional coupon codes to the basket are excluded from this offer. To receive 30% off please add the following code to the basket: ']"));
        System.out.println(popMesajYazdır.getText());
        //5. “close” butonuna basin
        driver.findElement(By.xpath("//*[text()='Close']")).click();
        Thread.sleep(5000);
        //6. "WebdriverUniversity.com (IFrame)" linkini tiklayin
        WebElement iframeLink=driver.findElement(By.xpath("(//a[@id='nav-title'])[1]"));
        action.moveToElement(iframeLink).doubleClick().perform();
        //7. "http://webdriveruniversity.com/index.html" adresine gittigini test edin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="http://webdriveruniversity.com/index.html";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
