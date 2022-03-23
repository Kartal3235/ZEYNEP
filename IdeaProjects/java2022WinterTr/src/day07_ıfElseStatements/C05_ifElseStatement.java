package day07_ıfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C05_ifElseStatement {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin

        //pazar veya cumartesi ise hafta sonu
        //pazartesi veya salı veya çarşamba veya perşembe veya cuma hafta içi


        //String case sensitive dir
        //yani pazar PAZAR Pazar PAzar bunlar hep farklıdır

        // bu durumda String methodlarından yardım alırız

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfern gün ismi yazınız");
        String gunIsmi= scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESİ")){
            System.out.println("girdiginiz gun haftasonu");
        }else{
            System.out.println("girdiğiniz gün hafta ici");
        }

    }
}
