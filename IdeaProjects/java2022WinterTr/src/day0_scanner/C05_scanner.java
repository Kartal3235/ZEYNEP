package day0_scanner;

import java.util.Scanner;

public class C05_scanner {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz");
        double yarıçap= scan.nextDouble();


        System.out.println("girdiğiniz yarıçap :"+ yarıçap);
        System.out.println("çemberin çevresi:"+ 2*3.14*yarıçap);
        System.out.println("dairenin alanı: "+3.14*yarıçap*yarıçap);

        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yarıçap giriniz:");

        double yarıçap=scan.nextDouble();

        System.out.println("yarıçapı giriniz:"+yarıçap);
        System.out.println("çemberin çevresi:"+2*3.14*yarıçap);
        System.out.println("dairenin alanı:"+3.14*yarıçap*yarıçap);



    }
}
