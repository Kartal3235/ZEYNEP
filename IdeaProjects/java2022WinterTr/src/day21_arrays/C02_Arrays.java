package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        String arr1[]={"Ali","Veli","Ayşe"};

        // Array içindeki elemnentlere ulaşabilmek için index kullanırız.
        System.out.println(arr1[0]);

        arr1[1]="Esila";
        System.out.println(arr1[1]);

        // Array içindeki index i kullanarak elementlere ulaşabilir ve update edebiliriz.

        int arr2[] =new int[4];

        System.out.println(arr2[1]);
        System.out.println(arr2[3]);


        // Array in tamamını yazdırmak istersek?

        //System.out.println(arr2);

        // Array lar non primitive olduklarından direk yazdırmak istersek
        // Java referance bilgisini yazdırır


        for (int i = 0; i <4 ; i++) {
            System.out.print(arr2[i]+" ");

        }

        // Array i yazdırmak için Java daki Arrays class ından toString() kullanılır.

        System.out.println(Arrays.toString(arr1));

        arr2[1]=11;
        arr2[3]=22;
        System.out.println(Arrays.toString(arr2));
    }
}
