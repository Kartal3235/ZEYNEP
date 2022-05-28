package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverİlkClass {

    @Test
    public void tes01() {
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");
        Driver.closeDriver();
    }
}
