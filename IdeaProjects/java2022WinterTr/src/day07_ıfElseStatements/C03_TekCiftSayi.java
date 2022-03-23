package day07_ıfElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi=scan.nextInt();

        if (sayi%2 ==0 ){
            System.out.println("girilen sayı çift sayıdır");

    }
        if (sayi%2!=0){
            System.out.println("girilen sayı tek sayıdır");

        // Normalde bir sayı ya tekdir veya çifttir,ucuncu bir durum yoktur
            //o zaman tek olması ve çift olmasını iki ayrı if ile değil
        // if else ile çözüm

            if (sayi%2==0){
                System.out.println("girdiğiniz sayi çift sayıdır");
            }else{
                System.out.println("girdiğiniz sayi tekdir");
            }
        }
}}

