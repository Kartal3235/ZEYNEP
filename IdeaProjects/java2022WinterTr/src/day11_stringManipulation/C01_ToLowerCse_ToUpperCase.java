package day11_stringManipulation;

import java.util.Locale;

public class C01_ToLowerCse_ToUpperCase {
    public static void main(String[] args) {

        String str="Java Güzeldir";

        // Biz String metotlarını arka arkaya kullanabiliriz
        //Mesela ikinci kelimenin ilk harfini küçük yazdıralım

        //str.charAt(5); böyle yazdığımızda sonuç artık string değil char olacaktır
        //Dolayısıyla String de yapmak istediğimiz tüm değişiklikleri
        //önce yapıp sonra charAt() metodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("german")));

    }
}
