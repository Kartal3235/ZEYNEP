package file;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileDownload extends TestBase {

    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/download adresine gid elim
        driver.get("https://the-internet.herokuapp.com/download");
        //dummy.txt dosyasını indirelim
        driver.findElement(By.xpath("//*[text()='dummy (2).txt']")).click();
        // dosyanın başarıyla indirilip indirilmediğini test edelim
        // Dosya Downloads a indirilecektir.
        System.out.println(System.getProperty("user.home"));

        String dosyaYolu=System.getProperty("user.home")+"\\Download\\dummy(2).txt";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

}
