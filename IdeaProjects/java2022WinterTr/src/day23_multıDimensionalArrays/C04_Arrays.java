package day23_multıDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


        // Kullanıcıdan kaç elementlik bir array oluşturacağını sorun
        //array i oluşturup elementleri kullanıcıdan alıp,array e atayın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaç elementli bir array istediğinizi yazın");

        int uzunluk=scan.nextInt();// 5

        int arr[]=new int[uzunluk]; // [0,0,0,0,0]

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("Array için "+(i+1)+".elemanı giriniz");

            arr[i] = scan.nextInt();


        }
        System.out.println(Arrays.toString(arr));

    }
}
