package TekrarTesti;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03 extends TestBase {
    @Test
    public void test01() {
        //1. https://www.n11.com/ adresine gidilerek headerdan “Mağazalar/Mağazaları Gör”
        //seçilir.
        driver.get("https://www.n11.com/");
        //2. Tüm Mağazalar butonuna tıklanır. A harfindeki tüm mağazalar bir excel, csv veya
        //txt dosyasına yazdırılır.
        Actions action =new Actions(driver);
        WebElement mağazalar=driver.findElement(By.xpath("//span[@title='Mağazalar']"));
        action.moveToElement(mağazalar).perform();
        WebElement mağazaGör=driver.findElement(By.xpath("//*[text()='Mağazaları Gör']"));
        action.click(mağazaGör).perform();
    }
}
