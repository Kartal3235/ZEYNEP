package day22_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        // Verilen array de istenen bir elementin var olup olmadığını true/false yazdırarak
        // gösteren bir method oluşturun.

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int istenenSayi=1;

        istenenEelemanVarMi(arr,istenenSayi);

        // eğer Java da hazır binarySearch ile yapmak isterseniz
        // önce sort methodunu kullanıp,sonra binarySearch yapmalıyız


    }

    private static void istenenEelemanVarMi(int[] arr, int istenenSayi) {


        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {


            if(arr[i]==istenenSayi){
                sonuc=true;

                break;
            }
        }
        System.out.println(sonuc);
    }
}
