package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Priority extends TestBase {
    /*
    TestNG test methodlarını isim sırasına göre çalıştırır
    Eğer isim sıralamasının dısında bir sıralama ile çalışmasını isterseniz o zaman test methodlarına
    öncelik yani PRİORİTY tanımlayabiliriz

    priority küçükten büyüğe göre çalışır

    test methodunda priority atanmamışsa default olarak yanı priority=0 kabul edilir
     */

    @Test(priority=5)
    public void tes01() {

        driver.get("https://www.amazon.com");

    }
    @Test(priority=-2)
    public void tes02() {

        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void tes03() {

        driver.get("https://www.techproeducation.com");

    }
}
