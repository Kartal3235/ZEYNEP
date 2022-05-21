package TekrarTesti;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.Arrays;
import java.util.List;

public class C01 extends TestBase {
    @Test
    public void test01()  {
        //1amazon gidin
        driver.get("https://www.amazon.com");
        //2 Arama kutusunun solundaki drop down menuyu handle edip listesini ekrana yazdırın
        // Dropdown kullanabilmek için 3 şartımız vardır
        //1. şart drop down locate edilecek
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        //2.şartımız select objesi oluşturmak
        Select select=new Select(ddm);
        //3. şartımız ise istediğimiz optionsı seçmek
        List<WebElement> tumOptions=select.getOptions();

        for (WebElement each:tumOptions
             ) {
            System.out.println(each.getText());
        }
        //3 drop down menude 28 eleman olduğunu doğrulayın
        int actualSonucYazısı=tumOptions.size();

        Assert.assertEquals(28,actualSonucYazısı);

    }
    @Test
    public void test02(){
        //1 dropdown menuden elektronik bölümü seçin
        driver.get("https://www.amazon.com");
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Electronics");
        //2 arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırı n
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("iphone" + Keys.ENTER);

        //3sonuc sayisi bildiren yazinin iphone icerdigini test edin
        WebElement sonucYazısı=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String actualSonucYazısı=sonucYazısı.getText();
        String []arr=actualSonucYazısı.split(" ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[5]);
        Assert.assertTrue(actualSonucYazısı.contains("iphone"));
        //4 ikinci ürüne relative locater kullanarak tıklay in
        WebElement ilkUrun=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        WebElement ucuncuUrun=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));
        WebElement ikinciUrun=driver.findElement(RelativeLocator.with(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).below(ilkUrun).above(ucuncuUrun));
       ikinciUrun.click();
        //5 ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
        String actualBaslık=driver.getTitle();
        WebElement fiyatBılgısıHak=driver.findElement(By.xpath("//*[text()=' Currently unavailable. ']"));
        String actualFıyat=fiyatBılgısıHak.getText();
        driver.findElement(By.xpath("//span[@class='a-button a-button-groupfirst a-spacing-none a-button-base a-declarative']")).click();

    }

    @Test
    public void test03() {
        //1 yeni bir sekme açarak amazon a nasayfaya gid in
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        //2 dropdown’dan bebek bölümüne secin
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Baby");
        //3 bebek puset aratıp bulundan sonuç sayısını yazdırın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby stroller"+Keys.ENTER);
        //4 sonuç yazsının puset içerdiğini te st edin
        WebElement sonucYaqzısı=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String actualYazı=sonucYaqzısı.getText();
        Assert.assertTrue(actualYazı.contains("stroller"));
        //5 üçüncü ürüne relative locater kullanarak tıklay in
        WebElement dorduncuurun=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[4]"));
        WebElement ucuncuUrun=driver.findElement(RelativeLocator.with(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).above(dorduncuurun));
        ucuncuUrun.click();
        //6 title ve fiyat bilgilerini assign edelim ve ürünü sepete ekley in
        String actualTitle=driver.getTitle();
        WebElement fiyatBilgisi=driver.findElement(By.xpath("//*[text()=' Temporarily out of stock. ']"));
        String actualFiyat=fiyatBilgisi.getText();
        System.out.println(actualFiyat);
        driver.findElement(By.xpath("//span[@class='a-button a-button-groupfirst a-spacing-none a-button-base a-declarative']")).click();


    }

}