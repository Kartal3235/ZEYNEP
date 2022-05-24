package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k=0;
            while((k=fis.read())!=-1){

                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Exceptionlar içinde parent child ilişkisi mevcuttur.
        Eğer bir kod için birden fazla exception oluşma ihtimali varsa
        Öncelikle olası exception lar parent-chşld ilişkisi taşıyorr mu bakmamız gerekir.
        Eğer parent child ilişkisi yoksa istediğimiz sırada catch cümleleri oluşturabiliriz

        Eğer Parent child iliş
         */



        /*
        Altı kırmızı çizili olan her kod CTE değildir.
        Java syntax hatalarını derleme esnasında (compile) farkeder ve altını çizer.
        biz bu güne kadar tamamına CTE diyorduk
        ANCAK;
        exception konusu ile birlikte
        Compile Time Exception kavramı da hayatımıza girdi.

         */

    }
}
