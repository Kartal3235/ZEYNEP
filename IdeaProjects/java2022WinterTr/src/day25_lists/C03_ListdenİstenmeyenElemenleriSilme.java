package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenİstenmeyenElemenleriSilme {
    public static void main(String[] args) {

        // Verilen bir array den istenen elementi(kaç tane varsa) silip,kalanları
        //yeni bir array olarak yazdıran bir method oluşturun


        int arr[]={3,4,2,3,5,7,8,5,2,4};

        int istenmeyenEleman=3;

        istenmeyenElementiSilveYazdir(arr,istenmeyenEleman);

    }

    private static void istenmeyenElementiSilveYazdir(int[] arr, int istenmeyenEleman) {


        List<Integer>yeniList = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                yeniList.add(arr[i]);
            }

        }
        System.out.println(yeniList);
    }
}
