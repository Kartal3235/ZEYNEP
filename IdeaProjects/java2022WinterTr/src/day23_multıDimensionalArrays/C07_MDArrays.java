package day23_multıDimensionalArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {

        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin


        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz");
        String cumle=scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("Girdiğiniz cümledeki kelime sayısı: "+arr.length);

    }
}
