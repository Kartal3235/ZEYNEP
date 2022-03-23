package day10_swicth_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {

        //String de herhangi bir karakteri almak istediğimizde o harfin index i ni kullanarak
        //str.charAt(istenenIndex) yazabiliriz

       /* String str="Java Cok Güzel";

        //burda J yi yazdıralım

        System.out.println(str.charAt(0));

        // G yi yazddıralım

        System.out.println(str.charAt(9));

        // va yazdıralım

        System.out.println(""+str.charAt(2)+str.charAt(3));

        //cOK şeklinde yazdıralım

        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7));


        // son harfi yazdır
        // String de 14 harf var dolayısıyla, son harfin index i 14-1
        System.out.println(str.charAt(14-1));// uzunluk-1

        //Eğer uzunluğu index olarak girersek
        //java çalıştıktan sonra hata verir

        System.out.println(str.charAt(14));

        */

        String str="Oyuncaklarını toplarmısın çocuğum ";
        System.out.println(str.charAt(14));
        System.out.println(str.charAt(20));
        System.out.println(str.charAt(30));
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(14-1));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("germany")));
        System.out.println(str.toUpperCase().charAt(2));


    }
}
