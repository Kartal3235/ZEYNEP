package readExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05 {
    @Test
    public void readExcelTest() throws IOException {

        // ingilizce başkentler sütununu yazdıralım
        String filePath="src/readsource/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(filePath);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sheet=wb.getSheet("Sayfa1");
        int rowcount=wb.getSheet("Sayfa1").getLastRowNum()-wb.getSheet("Sayfa1").getFirstRowNum();

        for (int i = 1; i <=rowcount ; i++) {
                Row row=sheet.getRow(i);

            for (int j = 1; j <=1 ; j++) {
                System.out.println(row.getCell(j).getStringCellValue());
            }


        }

    }
}
