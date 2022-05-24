package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {

        /*
        Bir kod yazılırken olası exceptionlar öngörülüp
        exception oluştuğunda Java nın ne yapmasını istediğimiz belirtilmelidir.

        1-Eğer exception oluştuğunda kodun çalışmaya devam etmesini istemiyorsak
        method isminin yanına  oluşabilecek exception ı deklare edebiliriz

        2- Eğer exception oluşsa da kodun çalışmaya devam etmesini istiyorsak sorun oluşturabilecek
        kodu try catch bloğunun içine alır
        try bloğuna sorun çıkabilecek kodu
        catch bloğuna oluşabilecek exception ı ve olası exception durumunda Javanın ne yapmasını istediğimizi yazabiliriz.
         */

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
