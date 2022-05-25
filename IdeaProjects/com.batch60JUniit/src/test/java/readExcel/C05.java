package readExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
        int rowcount=wb.getSheet("Sayfa1").getLastRowNum();
        int column=wb.getSheet("Sayfa1").


        for (int i = 1; i <=rowcount ; i++) {


            


        }

    }
}
