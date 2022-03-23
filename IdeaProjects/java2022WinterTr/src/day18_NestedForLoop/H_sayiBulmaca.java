package day18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {

        //bilgisayara 1 ile 100 arasında bir sayı tutturun
        //kullanıcıdan bu sayıyı tahmin etmessini isteyin
        //girilen her tahminde sayiyi buyut veya küçült diye kullanıcıya yol gösterin
        //kullaını sayiyi bulduğunda kaç tahminde sayiyi bulduğunu kullanıcıya yazdırın

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        System.out.println(sayi);

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while(sayi!=tahmin){

            System.out.println("lütfen bir sayı giriniz:");
            tahmin=scan.nextInt();
            if (tahmin>sayi){

                System.out.println("daha küçük bir sayı söylemelisin");
                sayac++;
            }else if(tahmin<sayi){

                System.out.println("daha büyük bir sayi söylemelisin");
                sayac++;

            }

        }

        System.out.println("tuttuğum sayiyi"+sayac+"tahminde bulunuz");
    }

}


