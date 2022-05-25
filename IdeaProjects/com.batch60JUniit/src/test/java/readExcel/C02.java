package readExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02 extends TestBase {
    @Test
    public void readexcleTest() throws IOException {
        // dosya yolunun oluşturuyoruz
        String dosyaYolu="src/readsource/ulkeler (1).xlsx";
        // Çalışma kitabına erişim kazanmaya çalışacaz
        FileInputStream fis=new FileInputStream(dosyaYolu);
        //Worbook objesi oluşturacağız
        Workbook wb= WorkbookFactory.create(fis);
        // Saqyfaya erişim sağlayacaz
        Sheet sheet=wb.getSheet("Sayfa1");
        // satıra ulaşacaz
        Row row=sheet.getRow(1);
        //satırdan sonra hücreye ulaşacaz
        Cell cell=row.getCell(1);
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        WebElement gender=driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='userNumber']"));
        WebElement fileClick=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        String farklıKısım="user.home";
        String ortakKısım="\\Desktop\\ok.xlsx";
        String dosyaYolu1=farklıKısım+ortakKısım;
        fileClick.sendKeys(dosyaYolu1);
        WebElement adress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));

        for (int i = 0; i <sheet.getLastRowNum() ; i++) {
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            mobileNumber.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
            adress.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());

        }
        gender.click();
        submit.click();
    }
}
