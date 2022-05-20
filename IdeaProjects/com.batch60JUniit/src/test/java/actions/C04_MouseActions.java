package actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_MouseActions extends TestBase {
    @Test
    public void test01() {

        //https://demoqa.com/droppable adresine gidelim
            driver.get("https://demoqa.com/droppable");
        //--“Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        Actions action=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
        action.dragAndDrop(source,target).perform();

        //--“Drop here” yazisi yerine “Dropped!” oldugunu test edin
        WebElement dropYazı=driver.findElement(By.xpath("//*[text()='Dropped!']"));
        String actualDropYazı=dropYazı.getText();
        String expectedDropYazı="Drop here";
        Assert.assertEquals(expectedDropYazı,actualDropYazı);
    }
}
