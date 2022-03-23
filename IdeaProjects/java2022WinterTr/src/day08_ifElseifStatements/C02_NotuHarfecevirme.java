package day08_ifElseifStatements;

import java.util.Scanner;

public class C02_NotuHarfecevirme {
    public static void main(String[] args) {
        //Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50-60 arasi “C”,
        // 60-80 arasi “B”,
        // 80’nin uzerinde ise “A”
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double notsayi=scan.nextDouble();
        if (notsayi<0 || notsayi>100){
            System.out.println("Lütfen geçerli not giriniz");
        }

        else if (notsayi<50){
            System.out.println("notunuz D");

        } else if (notsayi >= 50 && notsayi < 60) {
            System.out.println("notunuz C");
        }else if (notsayi>=60 && notsayi<80) {
            System.out.println("Notunuz B");
        }else{
            System.out.println("Notunuz A");
        }

}}
