package day18_NestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //  Kullanıcıdan kaç sayı toplamak istediğini alın
        // bu sayıları alın ve bu vsayıların toplamını ekrana yazdırın

        int sayiAdedi=5;

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lütfen bir sayı giriniz");

            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen "+sayiAdedi+" sayinin toplamı:"+toplam);


        // While ile yapalım

        sayi=0;
        toplam=0;
        int sayac=1;

        while(sayac<=sayiAdedi){

            System.out.println("Lütfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen "+ sayiAdedi+" sayinin toplamı:"+toplam);
    }
}
