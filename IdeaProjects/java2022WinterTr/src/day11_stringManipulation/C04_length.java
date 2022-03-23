package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        //Kullanıcıdan ismini alıp baş harfini ve son harfini büyük harflerle yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();


        System.out.println("ilk harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf:"+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-3));

        String str2=null;
        System.out.println(str2);
        //System.out.println(str1.length());// çalıştırıldığında hata verir

        String str3;
        //System.out.println(str3);
        // Str3 ile Str2 ye değer atanmamıştır
        // str2 null pointer ile işaretlendişğinden java durumun kontrol altında olduğunu bilir
        // ve geriye kalan kodun çalışmasına engel olmaz
        // ancak str3 e bir değer ataması olmayınca java altını kırmızı çizer
        // ve bu durum duzeltilinceye kadar kodun geriye kalaninin calismasinada izin vermez


    }
}
