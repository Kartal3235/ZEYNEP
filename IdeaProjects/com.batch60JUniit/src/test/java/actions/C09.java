package actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C09 extends TestBase {
    @Test
    public void test01() {
        driver.get("https://www.rediff.com/");

        WebElement iframeElement=driver.findElement(By.xpath("(//iframe[@id='moneyiframe'])[1]"));
        driver.switchTo().frame(iframeElement);
        WebElement nseYazdır=driver.findElement(By.xpath("//span[@id='nseindex']"));

        String actualNseYazdır=nseYazdır.getText();
        System.out.println(actualNseYazdır);
    }
}
