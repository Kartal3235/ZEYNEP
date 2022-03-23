package day09_ternary_Swich;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {

        //Ternary ile yapılan tüm işlemler if else ile de yapılabilir
        //if else yerine ternary tercih etme sebebi yapıunın basit ve anlaşılabilir olmasıdır
        //ternary içerisinde kompleks kodlar olmaz
        //sadece sonuç veya bizi sonuca götüren basit işlemler olabilir

        //kullanıcıdan bir tam sayı alıp tek mi çift mi yazdıran bir kod yazalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");

        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi çift");
        }else{
            System.out.println("sayı tek");
        }

        System.out.println(sayi%2==0 ? "sayı çift" : "sayi tek");
    }
}
