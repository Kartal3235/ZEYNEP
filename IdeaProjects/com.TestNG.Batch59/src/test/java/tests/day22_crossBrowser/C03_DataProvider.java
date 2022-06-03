package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {



    @Test
    public void test01() {
        AmazonPage amazonpage = new AmazonPage();
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // nutella için arama yapalım
        amazonpage.aramaKutusu.sendKeys("Nutella"+Keys.ENTER);
        // sonuçların nutella içerdiğini test edelim
        String expectedKelime="Nutella";
        String actualKelime=amazonpage.aramaSonucElementi.getText();

        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
    }

    @DataProvider
    public static Object[][] AranacakKelimeler() {

        Object[][] arananKelimeArray={{"Nutella"},{"Java"},{"ciğdem"},{"Netherlands"}};
        return arananKelimeArray;
    }

    @Test(dataProvider = "AranacakKelimeler")

    //arayacağımız kelimeleri bir liste gibi tutup
    // bana yollayacak bir veri sağlayıcısı oluşturacağız

    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonpage = new AmazonPage();
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Nutlla ,java, ciğdem ve netherlands için arama yapalım
        amazonpage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);
        // sonucların aradığımız kelime içerdiğini test edelim

        String expectedKelime=arananKelime;
        String actualKelime=amazonpage.aramaSonucElementi.getText();
        //sayfayı kapatalım
        Driver.closeDriver();
    }
}
