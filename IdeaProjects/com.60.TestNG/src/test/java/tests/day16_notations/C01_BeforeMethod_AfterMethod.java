package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    //J unit de before class ve after class notasyonuna sahip
    //methodlar static olmak zorundaydı
    // Test Ng de bu zorunluluk ortadan kalkıyor
    @Test
    public void tes01() {

        driver.get("https://www.amazon.com");

    }
    @Test
    public void tes02() {

        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void tes03() {

        driver.get("https://www.techproeducation.com");

    }
}
