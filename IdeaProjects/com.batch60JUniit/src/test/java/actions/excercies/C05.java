package actions.excercies;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class C05 extends TestBase {
    @Test
    public void test02() {
        //Notes: It may also be necessary to write code to accept the accept cookies warning.
        //1. Go to 'https://www.amazon.com.tr/'
        driver.get("https://www.amazon.com.tr/");
        //2. Search iPhone13 512
        Set<Cookie> tumCookie=driver.manage().getCookies();
        System.out.println("Size of cookies: "+tumCookie.size());//tum cookie lerin sayısı
        for (Cookie each:tumCookie
             ) {
            System.out.println(each.getName() + ":" + each.getValue());// çerezlerin adını ve değerlerini yazdırdık

        }
        System.out.println(driver.manage().getCookieNamed("session-id-time"));
        //session-id-time=2082787201l; expires=Pzt, 22 May 2023 03:08:22 EET; path=/;
        // domain=.amazon.com.tr;secure;
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Elektronik");
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iPhone13 512"+ Keys.ENTER);

        //3. Check that the results are listed
        WebElement checkResult=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(checkResult.isDisplayed());

        //4. Click iPhone13 at the top of the list
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();
        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        WebElement size01=driver.findElement(By.xpath("//input[@aria-labelledby='size_name_10-announce']"));
        WebElement size02=driver.findElement(By.xpath("//input[@aria-labelledby='size_name_0-announce']"));
        WebElement size03=driver.findElement(By.xpath("//input[@aria-labelledby='size_name_1-announce']"));
        WebElement size04=driver.findElement(By.xpath("//input[@aria-labelledby='size_name_2-announce']"));
        WebElement size05=driver.findElement(By.xpath("//input[@aria-labelledby='size_name_3-announce']"));

        List<WebElement> tumİphoneModel=new ArrayList<>(Arrays.asList(size01,size02,size03,size04,size05));


        for (int i = 0; i <tumİphoneModel.size() ; i++) {
                    tumİphoneModel.get(i).click();

        }

    }
}
