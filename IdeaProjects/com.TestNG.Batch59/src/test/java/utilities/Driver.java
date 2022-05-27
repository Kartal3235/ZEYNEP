package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /*
    POM'de driver icin TestBase classine extends etmek yerine
   Driver class'indan static methodlar kullanarak
   driver olusturup ilgili ayarlarin yapilmasi ve en sonda
   driverin kapatilmasi tercih edilmistir
     */

     static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();//  burda her seferinde yeni bir pencere acılıyor
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }


    public static void closeDriver(){

        if(!(driver==null)){ // driver'a bir değer atanmışsa,
            driver.close();  // driver'ı kapat
            driver = null;
        }

    }
}
