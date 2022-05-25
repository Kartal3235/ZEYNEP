package readExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01 {
    @Test
    public void readExcelTest() throws IOException {
        //7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu="src/readsource/ulkeler (1).xlsx";
        //8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);
        //9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        //10.WorkbookFactory.create(fileInputStream)
        Workbook workbook= WorkbookFactory.create(fis);
        //11. Worksheet objesi olusturun
        Sheet sheet=workbook.getSheet("Sayfa1");
        //workbook.getSheetAt(index)
        //12. Row objesi olusturun
        Row row =sheet.getRow(1);
        //sheet.getRow(index)
        //13. Cell objesi olusturun
        Cell cell=row.getCell(3);
        //row.getCell(index)
    }
}
