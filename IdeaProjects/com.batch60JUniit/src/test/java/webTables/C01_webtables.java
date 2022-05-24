package webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;
import java.util.stream.Collectors;

public class C01_webtables extends TestBase {
    @Test
    public void test01() {

        //●login(login() metodun oluşturun ve oturum açın
        girişYap();
        //●https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //○Username : manager
        //○Password : Manager 1
        //●table(table() metodu oluşturun
        //○Tüm table body’sinin boyutunu(sutun sayisi ) bulun. /tbody

        List<WebElement> sutunBaslıkları=driver.findElements(By.xpath("//thead//tr[1]//th"));
        System.out.println("sütun sayısı: "+sutunBaslıkları.size());
        //○Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
        WebElement tumBody=driver.findElement(By.xpath("//tbody"));
        System.out.println(tumBody.getText());
        //●printRows(printRows() metodu oluşturun //tr
         //○table body’sinde bulunan toplam satir(row) sayısını bulun.
        List<WebElement>satırListesi=driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("satır sayısı: "+satırListesi.size());
        //○Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each:satırListesi
             ) {
            System.out.println(each.getText());
        }
        //○4.satirdaki(row) elementleri konsolda yazdırın.
        List<WebElement>dortsatırElement=driver.findElements(By.xpath("//tbody//tr[4]//td"));
        dortsatırElement.stream().map(t->t.getText()).forEach(System.out::println);

        // email baslığındaki tum elementleri konsolda yazdırın.
        // önce email başlığının kaçıncı sütunda olduğunu bulalım
        List<WebElement>baslıklarListesi=driver.findElements(By.xpath("//thead//tr[1]//th"));
        int emailSütunNo=0;
        for (int i = 0; i <baslıklarListesi.size() ; i++) {
            if(baslıklarListesi.get(i).getText().equals("Email")){
                emailSütunNo=i;
            }
        }
        List<WebElement>emailSutunListesi=driver.findElements(By.xpath("//tbody//td["+(emailSütunNo+1)+"]"));
        System.out.println(emailSutunListesi.stream().map(t -> t.getText()).collect(Collectors.toList()));
    }

    public void girişYap() {
        ////●https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //        //○Username : manager
        //        //○Password : Manager 1
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.linkText("Log in")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();
    }
}
