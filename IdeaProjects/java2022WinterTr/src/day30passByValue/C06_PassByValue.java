package day30passByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {

        // non primitive data türlerinde objenin kendisi değil de içindeki elementler değişirse
        // java obje nin referansı ve objenin KENDİSİ değişmediği için element değişiklikleri kalıcı yapar


        int arr[]={1,2,3};

        System.out.println(Arrays.toString(arr));
    arrDegistir(arr);
        System.out.println("method call sonrası : "+Arrays.toString(arr));
    }

    private static void arrDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }

}
