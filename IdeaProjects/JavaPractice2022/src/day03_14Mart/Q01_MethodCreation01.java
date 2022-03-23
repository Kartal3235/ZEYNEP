package day03_14Mart;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("yapacağınız dört işlemi*+-/ olarak seçiniz:");

        char islem=scan.next().charAt(0);

        System.out.println("birinci sayı:");
        double num1=scan.nextDouble();
        System.out.println("ikinci sayı:");
        double num2=scan.nextDouble();

        hesapMakinesı(islem,num1,num2);


    }

    private static void hesapMakinesı(char islem, double num1, double num2) {

        switch(islem){

            default:
                System.out.println("Dört islem harinci islem yaptınız");

            case'+':
                System.out.println(num1+"+"+num2+"="+(num1+num2));
                break;
            case'-':
                System.out.println(num1+"-"+num2+"="+(num1-num2));
                break;
            case'/':
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            case '*':
                System.out.println(num1+"*"+num2+"="+(num1*num2));


        }
    }

}