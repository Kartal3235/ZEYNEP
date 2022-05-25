package readExcel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_ExcelYazma {
    @Test
    public void excelYazma() throws IOException {
        String filePath="src/readsource/ok.xlsx";
        FileInputStream fis =new FileInputStream(filePath);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sheet=wb.getSheet("AGE");

        int rowcount=sheet.getLastRowNum();
        System.out.println("Sayfada bulunan toplam satır saysı: "+rowcount);
        int columncount=sheet.getRow(1).getLastCellNum();
        System.out.println("Sayfada bulunan: "+columncount);

        for (int i = 0; i <=rowcount ; i++) {
            Cell cell=sheet.getRow(i).getCell(1);
            String cellText="";

            if(cell.getCellType()== CellType.STRING){
                cellText=cell.getStringCellValue();
            }else if(cell.getCellType()==CellType.NUMERIC){
                cellText= String.valueOf(cell.getNumericCellValue());
            }else if(cell.getCellType()==CellType.BLANK){
                cellText="";
            }
        }
    }
}
