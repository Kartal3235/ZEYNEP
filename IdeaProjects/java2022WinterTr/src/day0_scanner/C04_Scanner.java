package day0_scanner;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //scanner kullanmak için 3 adım takip ediyoruz
        //1.
        Scanner scan = new Scanner(System.in);

        //2.adım

        System.out.println("Lütfen isminizi giriniz");

        //3.adım

        String kullanıcıİsmi= scan.nextLine();
        System.out.println("Kullanıcının girdiği isim: "+kullanıcıİsmi);



    }
}
