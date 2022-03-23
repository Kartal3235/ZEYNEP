package day23_multıDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {


        // verilen bir array e yeni bir element ekleyen bir method oluşturun

        int arr[]={3,5,7};

        //arr[3]=8;  array de olmayan bir index e atama yapamayız

        //arr={1,3,5,6};// var olan bir array e aynı boyutta bile olsa direk yeni değerler içeren

        arr=new int[4];
        System.out.println(Arrays.toString(arr));


        int arrYeni[]=new int[5];

        System.out.println(Arrays.toString(arrYeni));

        arrYeni[0]=2;
        arrYeni[3]=5;
        arr=arrYeni;

        System.out.println(Arrays.toString(arr));

        // Bir arraye içinde hazır elementlerin olduğu yeni bir array atamak isterseniz
        // Bunu {1,2,3} şeklinde yazarak değil
        // new int[3] diyerek oluşturup sonra değer atayarak tamamladığımız bir arra i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));
    }
}
