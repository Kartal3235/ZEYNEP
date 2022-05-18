package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C06 {
    /*
      ...Exercise6...
   // 1. Amazon.com'a gidelim.
   // 2. DropDown üzerinde Books secelim.(All yazan yerde)
   //    kategorilerin hepsini konsola yazdiralim
   // 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
   // 4. Sonuc sayisini ekrana yazdiralim.
   // 5. Sonucların Les Miserables i icerdigini assert edelim
   */
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test(){
        driver.get("https://www.amazon.com");
        // 2. DropDown üzerinde Books secelim.(All yazan yerde)

        //dropdown oluşturmamız için  3 aşama vardır
        //1.aşama dropdown locate edilir.
        WebElement ddm=driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        //2.aşama Select objesi oluşturulur
        Select select=new Select(ddm);
        //3.aşma dropdown da var olan option'ı seceriz
        select.selectByVisibleText("Books");

       //    kategorilerin hepsini konsola yazdiralim
        List<WebElement> tumOps=select.getOptions();
        for (WebElement each:tumOps
             ) {
            System.out.println(each.getText());
        }
        // // 3. Arama kutusuna Les Miserables yazalım ve arama yapalim.
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Les Miserables"+ Keys.ENTER);
        // 4. Sonuc sayisini ekrana yazdiralim.
        WebElement sonucSayısı=driver.findElement(By.xpath("//*[text()='1-16 of over 5,000 results for']"));
       String actualYazı=sonucSayısı.getText();
        String[] arr=actualYazı.split(" ");
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[3]);
     // 5. Sonucların Les Miserables i icerdigini assert edelim
        WebElement sounuText=driver.findElement(By.xpath("//span[text()='Les Miserables']"));
        String actualText=sounuText.getText();
        String expected="Les Miserables";
        Assert.assertTrue(actualText.contains(expected));

    }
    @After
    public void tearDown() {
        driver.close();
    }
}
