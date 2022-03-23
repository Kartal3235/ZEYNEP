package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydeListOlusturma {
    public static void main(String[] args) {

        // Verilen bir arrayi listeye çevirin

        String arr[]={"A","B","C"};

        List<String> arraydenList=Arrays.asList(arr);

        // array den list e çevirdiğimiz zaman yeni list in uzunluğunu değiştiremeyiz
        //dolayısıyla yeni list ile add() ,remove(),clear(), gibi method lar çalıştırmak
        // istediğimiz de Exception olusur.

        arraydenList.add("J");//UnsupportedOperationException

        System.out.println("21.satırda list: "+arraydenList);

        arr[1]="F";

        System.out.println("23.satırda Array: "+Arrays.toString(arr));
        System.out.println("26.satıda list: "+arraydenList);
    }
}
