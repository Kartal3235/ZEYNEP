package day46_iterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTrestenYazdırma{
    public static void main(String[] args) {

        //verilen bir listeyi iterator ile sondan başa doğru yazdıralım

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        // Önve iterator  ı oluşturup sona yollayalım
        ListIterator itr=liste.listIterator();

        while(itr.hasNext()){

            itr.next();
        }

        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
}
