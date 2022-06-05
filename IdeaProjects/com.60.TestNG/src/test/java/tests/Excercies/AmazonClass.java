package tests.Excercies;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.AmznPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class AmazonClass {
    AmznPage aznp=new AmznPage();



    @Test
    public  void test01() {


        //Amazon ana sayfasinda en altta bulunan Webtable’i inceleyebilmek icin AmazonPage
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //clasinda en altta gitme isini yapacak bir method olusturun
        //public void altSatıraGitme (WebElement  WebElement altSatır){
        //    altSatır = Driver.getDriver().findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']"));
        //    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        //    jse.executeScript("arguments[0].scrollIntoView();", altSatır);
        //}
        //Tests paketi altinda yeni bir class olusturun: D26_AmazonSatirSutunSayisi

    }

    @Test
    public void test02() {
        //Bu class’in altinda bir test method olusturun : satirSayisi() ve webtable’da 10 satir oldugunu
        Driver.getDriver().get("https://www.amazon.com");
       List<WebElement> satır=Driver.getDriver().findElements(By.xpath("//table//tbody//tr"));
       satır.stream().map(WebElement::getText).forEach(System.out::println);
        System.out.println(satır.size());


        //test edin
        //Yeni bir method olusturun : sutunSayisi() ve yazi olan sutun sayisinin 7oldugunu test edin
    }
}
