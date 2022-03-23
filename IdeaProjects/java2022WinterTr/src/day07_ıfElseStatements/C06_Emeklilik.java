package day07_ıfElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        //kullanıcıdan yasını isteyin
        //65 veya daha büyükse emekli olabilirsin
        //65 den küçükse emekli olamazsın yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı giriniz");
        int yas=scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
    }else{
            System.out.println("emekli olamazsın");
            System.out.println(65-yas+ " sene daha çalışmalısın");
        }
        //if else statement larda iki durumdan sadece ve sadece biri çalışır
        // ikisinin birden çalışma ihtimali yoktur
        //ikisinin de çalışmama ihtimali yok

}}
