package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {

    /*
    TestNg test methodlarini isim sirasina gore calistirir
    eger isim siralamasinin disinda bir siralama ile calismasini isterseniz
    o zaman test methodlarinia oncelik (priority) tanimlayabiliriz.

    priority kucukten buyuge gore calisir
    eger bir test metthoduna priority degeri atanmamissa
    default olarak priority=0 olarak kabul edilir
     */

    @Test(priority=-5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
    @Test(priority=-2)
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
    }
}