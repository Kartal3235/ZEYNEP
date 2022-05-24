package webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void test02() {
        // önceki class daki adrese gidip
        //girişYap methodunu kullanarak sayfaya giriş yapın
        //input olarak verilen satır sayısı ve sutun sayısına sahip
        // cell deki text i yazdırın

        ////●https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //        //○Username : manager
        //        //○Password : Manager1!
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
        Actions action=new Actions(driver);
        WebElement username=driver.findElement(By.xpath("//div[@class='form-group']"));
        action.click(username).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.TAB).perform();
        driver.findElement(By.id("btnSubmit")).click();

        int satır=4;
        int sutun=4;
        // bunu dinamik yapmak lazım
        WebElement arananHucre=
                driver.findElement(By.xpath("//tbody//tr["+satır+"]//td["+sutun+"]"));

        System.out.println(arananHucre.getText());


    }


}
