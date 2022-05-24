package day46_iterators_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementiniArttırma {
    public static void main(String[] args) {

        //verilen listedeki her elementi 3 artırın

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);

        /*
        Listenin tüm elementlerini bize getirmesi için
        iterator ın hasNext() ve next() methodlarını kullanacağız
         */

        ListIterator itr=liste.listIterator();

        while(itr.hasNext()){// yanında element olduğu müddetçe çalışacak

          Object sayi=itr.next();
          itr.set((Integer)sayi+3);


        }
        System.out.println(liste);
    }
}
