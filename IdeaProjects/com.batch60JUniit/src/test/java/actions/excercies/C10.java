package actions.excercies;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C10 extends TestBase {
    @Test
    public void test01() {
        //1. "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //2. "Hover over Me First" kutusunun ustune gelin
        WebElement hoverOverMe=driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        Actions action=new Actions(driver);
        action.moveToElement(hoverOverMe).perform();
        //3. "Link 1" e tiklayin
        WebElement link1=driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));
        action.moveToElement(link1).click().perform();
        //4. Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());
        //5. Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
        //6. "Click and hold" kutusuna basili tutun
        WebElement clickAndHold=driver.findElement(By.xpath("//div[@id='click-box']"));
        action.moveToElement(clickAndHold).clickAndHold().perform();
        //7. "Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']")).getText());
        //driver.findElement(By.xpath("//*[text()='Well done! keep holding that click now.....']"))
        //8. "Double click me" butonunu cift tiklayin
        WebElement doubleClickMe=driver.findElement(By.xpath("//div[@id='double-click']"));
        action.moveToElement(doubleClickMe).doubleClick().perform();

    }
}
