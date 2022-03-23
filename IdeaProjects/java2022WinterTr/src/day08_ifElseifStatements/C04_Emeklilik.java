package day08_ifElseifStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazınız"+
                "\nKadın için K \nErkek için E harfini giriniz");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yas= scan.nextDouble();

        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("Lütfen girdiğiniz yaşı kontrol ediniz");
            }else if (yas<60){
                System.out.println("emekli olamazsın \ndaha "+(60-yas)+"yıl çalışmn gerekir");
            }else{
                System.out.println("emekli olabilirsin");
            }

        }else if (cinsiyet=='E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lütfen girdiğiniz yaşı kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsın \ndaha " + (60 - yas) + "yıl çalışmn gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        }else{
                System.out.println("Lütfen cinsiyet icin bir harf giriniz");
            }

        }




    }


