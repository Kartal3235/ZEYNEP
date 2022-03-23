package day08_ifElseifStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        //Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli
        //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütrfen İki sayı giriniz");

        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        if (sayi1>0 && sayi2>0){
            System.out.println("girdiğiniz iki sayti da pozitif olduğundan toplamları= "+(sayi1+sayi2));
        }else if (sayi1<0 && sayi2<0){
            System.out.println("girdiğiniz sayıda negatif olduğundan  çarpımları="+(sayi1*sayi2));
            // sayilarin ikisi farkli
            //isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        }else if (sayi1*sayi2<0){
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsını9z");

        }else{
            System.out.println("sıfır çarpmaya göre yutan elemandır");
        }



    }
}
