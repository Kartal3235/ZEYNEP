package actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C08_ extends TestBase {

    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        String ilkHandleDeger=driver.getWindowHandle();
        //Cizili alan uzerinde sag click yapalim
        Actions action=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        action.contextClick(element).perform();
        //Alert’te cikan yazinin “You selected a context menu” oldugunu
        //test edelim.
        String actualYazı=driver.switchTo().alert().getText();
        String expectedYazı="You selected a context menu";
        Assert.assertEquals(expectedYazı,actualYazı);

        //Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        Set<String> tumHandleDeger=driver.getWindowHandles();
        String ikinciHandleDeger="";
        for (String each:tumHandleDeger
             ) {
            if(!each.equals(ilkHandleDeger)){
                ikinciHandleDeger=each;
            }
        }

        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        driver.switchTo().window(ikinciHandleDeger);
        WebElement baslık=driver.findElement(By.xpath("//h1"));
        String actualbaslık=baslık.getText();
        String expectedBaslık="Elemental Selenium";
        Assert.assertEquals(expectedBaslık,actualbaslık);

    }
}
