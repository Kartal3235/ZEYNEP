package actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C07_KeybordsActions2 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //--"http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //Hover over Me First" kutusunun ustune gelin
        Actions action=new Actions(driver);
        WebElement hoverOverMe=driver.findElement(By.xpath("//*[text()='Hover Over Me First!']"));
        action.moveToElement(hoverOverMe).perform();
        //Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();
        //Popup mesajini yazdirin
        driver.switchTo().alert().getText();
        //Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //--“Click and hold" kutusuna basili tutun
        WebElement clıckAndHold=driver.findElement(By.xpath("(//div[@class='col-lg-12 text-center'])[3]"));
        action.clickAndHold(clıckAndHold).perform();

        Thread.sleep(3000);
        //--“Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']")).getText());

        //--“Double click me" butonunu cift tiklayin
        WebElement doubleClick=driver.findElement(By.xpath("//div[@class='div-double-click']"));
        action.doubleClick(doubleClick).perform();

    }
}
