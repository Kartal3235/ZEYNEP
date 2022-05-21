package file;

import org.junit.Test;

public class fileExist {
    @Test
    public void test() {
        System.out.println(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.home"));

        // masa üstündeki text1 dosyasının varlığını test edelim
        // C:\Users\ZEYNEP\Desktop\text1.txt
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text1.txt";
        System.out.println(dosyaYolu);

        String farklıKısım=System.getProperty("user.home");
        String ortakKısım="\\Desktop\\text1.txt";

        String masaUstuDosyaYolu=farklıKısım+ortakKısım;
    }
}
