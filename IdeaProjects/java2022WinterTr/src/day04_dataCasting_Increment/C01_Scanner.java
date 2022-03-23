package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        char ilkHarf= scan.next().charAt(0);
        // charAt(ındex) methodu parametre olarak yazdığımöız index deki char ı bize getirir
        // String de index 0 dan başlar

        System.out.println("Girdiğiniz ismin ilk harfi: " + ilkHarf);


    }
}
