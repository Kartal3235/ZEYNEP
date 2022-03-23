package day23_multıDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {


        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);

        // ilk inner array' in tüm elemantlerini yazdırın
        System.out.println(arr[0]);// arr[0] bir array olduğundan direk yazdırılmaz

        System.out.println(Arrays.toString(arr[0]));

        System.out.println(Arrays.toString(arr));// referans değerlerini yazdırır.

        //MDArray de tüm elementleri bir array olarak yazdırmak istersek;

        System.out.println(Arrays.deepToString(arr));


    }
}
