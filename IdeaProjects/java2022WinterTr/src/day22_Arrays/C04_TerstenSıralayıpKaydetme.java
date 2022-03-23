package day22_Arrays;

import java.util.Arrays;

public class C04_TerstenSıralayıpKaydetme {
    public static void main(String[] args) {


        // verilen bir arrayi buyukten kucuge sıralayıp bize dondurren method oluşturun

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        arr = terstenSirala(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("En buyuk Element:"+arr[0]);


    }

    public static int[] terstenSirala(int[] arr) {

        Arrays.sort(arr); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        int tersArr[] = new int[arr.length]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }

        return tersArr;
    }
}
