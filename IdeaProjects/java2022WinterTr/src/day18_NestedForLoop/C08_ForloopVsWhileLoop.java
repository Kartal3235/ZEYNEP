package day18_NestedForLoop;

import java.util.Scanner;

public class C08_ForloopVsWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan toplamak isrediğim sayıları alın
        //ve kullanıcı 0' a basıncaya kadar devam edin
        //girdiği tüm sayıların toplamını yazdırın



        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        for (int i = 1; i <1000000 ; i++) {

            System.out.println("lütfen bir sayı giriniz");
            sayi=scan.nextInt();

            if (sayi==0){
            break;
            }else{

            }toplam+=sayi;

        }

        System.out.println(toplam);


        sayi=1;
        toplam=0;
        while (sayi!= 0) {

            System.out.println("lütfen bir sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;


        }
        // başlangıç, bitiş ve değişim değerleri net olan durumlarda for loop daha avantajlıdır
        // ama adım sayısı belli olmayan durumlarda while loop daha avantajlıdır


    }
}
