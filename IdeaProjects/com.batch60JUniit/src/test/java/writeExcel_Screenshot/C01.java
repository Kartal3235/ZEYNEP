package writeExcel_Screenshot;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01 {
    @Test
    public void writeExcel() throws IOException {
        //3) Adimlari takip ederek 1.satira kadar gidelim
        String filePath="src/readsource/ulkeler (1).xlsx";
        FileInputStream fis=new FileInputStream(filePath);
        Workbook wb= WorkbookFactory.create(fis);
        //4) 5.hucreye yeni bir cell olusturalim
        //5) Olusturdugumuz hucreye “Nufus” yazdiralim
        wb.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        //6) 2.satir nufus kolonuna 1500000 yazdiralim
        wb.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(1500000);
        //7) 10.satir nufus kolonuna 250000 yazdiralim
        wb.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(250000);
        //8) 15.satir nufus kolonuna 54000 yazdiralim
        wb.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(54000);
        //9) Dosyayi kaydedelim
        FileOutputStream fos=new FileOutputStream(filePath);
        wb.write(fos);
        //10)Dosyayi kapatalim
        fis.close();
        fos.close();
        wb.close();
    }
}
