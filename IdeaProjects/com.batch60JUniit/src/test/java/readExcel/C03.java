package readExcel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03 {
    @Test
    public void readExcelTest() throws IOException {
                // input olarak verilen
                // satırNo,sutunNo değerlerini parametre olarak alıp
                // o cell deki datayı String olarak bana dondurren bir method oluşturun
        
                int satırNo=4;
                int sutunNo=4;
        
                // dönen String'in cezayir olduğunu test edin
                String expectedData="Cezayir";
                banaDataGetir(satırNo-1,sutunNo-1);
    }

    public String banaDataGetir(int satırIndex, int sutunIndex) throws IOException {
        String expectedData="";
        String filePath="src/readsource/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(filePath);
        Workbook wb= WorkbookFactory.create(fis);
         expectedData = wb.getSheet("Sayfa1").getRow(satırIndex).getCell(sutunIndex).toString();

        return expectedData;
    }

}
