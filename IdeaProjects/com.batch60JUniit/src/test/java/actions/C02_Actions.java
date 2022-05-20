package actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // amazon anasayfasına gidelim
        driver.get("https://www.amazon.com");
        // account menusunden creat a list linkine tıklayalım
        Actions actions =new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//*[text()='Account & Lists']"));
        actions.moveToElement(element).perform();

        driver.findElement(By.xpath("//*[text()='Create a List']")).click();

        /*WebElement linkTıkla=driver.findElement(By.xpath("//*[text()='Create a List']"));
        actions.click(linkTıkla).perform();*/

        Thread.sleep(5000);
    }

}
