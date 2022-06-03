package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver==null) {
            switch (ConfigReader.getProperty("browser")){


                case "edge":
                        WebDriverManager.edgedriver().setup();
                        driver=new EdgeDriver();
                        break;
                case "safari":
                        WebDriverManager.safaridriver().setup();
                        driver=new SafariDriver();
                        break;
                case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver=new FirefoxDriver();
                        break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();

            }

            WebDriverManager.chromedriver().setup();
            //driver = new ChromeDriver();// getDriver() methodunu her çağırdığımızda, driver'a new ChromeDriver atıyor.
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }
        return driver;
    }


    public static void closeDriver() {
        if (!(driver == null)){//driver a bir değer atanmışsa
        driver.close();        //driverı kapat
        driver = null;
      }
    }
}
