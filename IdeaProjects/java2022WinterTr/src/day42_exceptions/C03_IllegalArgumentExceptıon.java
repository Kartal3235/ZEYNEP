package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentExceptıon {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yaşını isteyin
        Kullanıcı yas olarak negatif bir sayı,0,120 den büyük bir sayı girerse
        illegalArgumentException oluşacak şekilde bir program yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz:");
        int yas=scan.nextInt();

        if(yas<=0||yas>120){
            //System.out.println("lütfen gecerli bir yas giriniz");
            // Java bizim istediğimiz durumlarda exception fırlatabilir
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun bir yas girdiniz");
        }
    }
}
