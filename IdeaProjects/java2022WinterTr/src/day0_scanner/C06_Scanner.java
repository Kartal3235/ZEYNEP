package day0_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
      /*  //Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        ////    Isim – soyisim :

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi yazınız");
        String İsim= scan.nextLine();
        System.out.println("Lütfen soyisminizi yazınız");
        String soyİsim= scan.nextLine();

        System.out.println("İsim-soyisim: "+ İsim+" "+soyİsim);

       */

       /* Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
          Isim – soyisim :

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim giriniz:");

        String isim=scan.next();
        String soyisim=scan.next();

        System.out.println("isim:"+isim);
        System.out.println("soyisim:"+soyisim);





    }


}
