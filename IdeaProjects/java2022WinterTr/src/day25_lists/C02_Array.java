package day25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {


        // Verilen bir array den istenen elementi(kaç tane varsa) silip,kalanları
        //yeni bir array olarak yazdıran bir method oluşturun



        //1. adim istenmeyen elementi sayacak(kaç tane var)
        // 2. adim yeni array olustur
        //3. adim eski array'den uygun elementleri yeniye taşi
        // 4. adim bunu yazdir.

        int arr[]={3,4,2,3,5,7,8,5,2,4};

        int istenmeyenEleman=3;

        istenmeyenElementiSil(arr,istenmeyenEleman);
    }

    private static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {

        // 1- istenmeyen element sayısını bulalım

        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenmeyenEleman ){
                sayac++;

            }

        }
    // 2- yeni arrayı oluşturalım
        int arrYeni[]=new int[arr.length-sayac];

    //3- eski arryden uygun elementleri yeniye taşı

         int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;

            }

        }
     // 4-listeyi yazdıralım
        System.out.println(Arrays.toString(arrYeni));
    }
}
