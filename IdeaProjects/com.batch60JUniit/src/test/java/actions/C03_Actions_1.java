package actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C03_Actions_1 extends TestBase {
    @Test
    public void test() throws InterruptedException {

        //https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        String ilkSayfaHandleDeger=driver.getWindowHandle();
        System.out.println(ilkSayfaHandleDeger);
        //Cizili alan uzerinde sag click yapalim
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        actions.contextClick(element).perform();

        //Alert’te cikan yazinin “You selected a context menu” oldugunu
        //test edelim.
        String actualYazı=driver.switchTo().alert().getText();
        String expectedYazı="You selected a context menu";
        Assert.assertEquals(expectedYazı,actualYazı);

        //Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //Elemental Selenium linkine tiklayalim

        // burda linke tıkladığımız zaman yeni bir sayfaya gececeğini bilmediğimizden dolayı
        //  driverimiz diğer link de kaldı onun için ikinci sayfanın handle değerini bulacağız

        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        Set<String> tumSayfaHandleDeger=driver.getWindowHandles();
        String ikinciSayfaWindowHandleDeger="";
        for (String each:tumSayfaHandleDeger
             ) {
            if(!each.equals(ilkSayfaHandleDeger)){
                ikinciSayfaWindowHandleDeger=each;
            }
        }
        driver.switchTo().window(ikinciSayfaWindowHandleDeger);

        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        WebElement h1Tag=driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        String actualH1=h1Tag.getText();
        String expected="Elemental Selenium";
        Assert.assertEquals(expected,actualH1);
        Thread.sleep(5000);
    }
}
