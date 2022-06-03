package tests.ReusableMethods_HtmlReports;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_WındowHandleReusableMethods {
    @Test
    public void test01() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //click here butonuna basınız
        Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
        // açılan yeni tabın tıtle ın "New Window" olduğunu test edin

        ReusableMethods.switchToWindow("New Wındow");

    }

    @Test
    public void test02() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("bahadır");
    }
}
