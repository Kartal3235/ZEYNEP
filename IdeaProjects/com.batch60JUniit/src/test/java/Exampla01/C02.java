package Exampla01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() {
        //driver.close();
    }
    /*
    1. C01_TekrarTesti isimli bir class olusturun
    2. https://www.google.com/ adresine gidin
    3. cookies uyarisini kabul ederek kapatin
    4. Sayfa basliginin “Google” ifadesi icerdigini test edin
    5. Arama cubuguna “Nutella” yazip aratin
    6. Bulunan sonuc sayisini yazdirin
    7. sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    8. Sayfayi kapatin
     */

    /*
    @Test
    public void amazonTest() {
        //1. https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");
        //2. arama kutusunu locate edelim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        //3. “Samsung headphones” ile arama yapalim
        String aranmasiIstenenMetin = "Samsung headphones";
        searchBox.sendKeys(aranmasiIstenenMetin + Keys.ENTER);
        //4. Bulunan sonuc sayisini yazdiralim
        WebElement sonucSayisiText = driver.findElement(By.xpath("//div[@data-cel-widget='UPPER-RESULT_INFO_BAR-0']"));
        Arrays.stream(sonucSayisiText.
                        getText().
                        split("\"")).
                limit(1).
                map(t -> t.
                        split(" ")).
                forEach(t-> System.out.println(aranmasiIstenenMetin + " icin sonuc sayisi = " + t[t.length-3]));
        //5. Ilk urunu tiklayalim
        driver.findElement(By.xpath("//img[@data-image-index='1']")).click();
        //6. Sayfadaki tum basliklari yazdiralim
        System.out.println("sayfa basligi: " + driver.getTitle());*/
}
