package writeExcel_Screenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_Screenshot extends TestBase {
    @Test
    public void screenshotTest() throws IOException {

        driver.get("https://www.trendyol.com");
        TakesScreenshot ts= (TakesScreenshot) driver;
        File tumSayfaResim=new File("target/ekrangörüntüsü/tümsayfaresimleri.jpeg");
        File temp=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temp,tumSayfaResim);

    }
}
