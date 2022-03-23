package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //Kullanıcıdan isim-soyisim bilgisini alıp
        //bütün harfleri * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi yazınız");
        String isimSoyisim=scan.nextLine();


        System.out.println(isimSoyisim.replaceAll("\\S","*"));

        String str="Javada rakamlar 1234567890";
        System.out.println(str.replace("a", "*"));

        System.out.println(str.replace("\\S", "*"));

        String str1="Cananlar Canana gitmek için can atıyor";
        System.out.println(str.replaceAll("Can","Turk"));




    }
}
