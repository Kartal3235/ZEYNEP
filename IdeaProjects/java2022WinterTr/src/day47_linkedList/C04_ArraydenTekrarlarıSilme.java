package day47_linkedList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlarıSilme {
    public static void main(String[] args) {

        // Verilen bir arrayden tekrar eden elementleri silip
        //uniq elementler oluşan bir array haline dönduren bir method oluşturun.


        Integer arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arr=benzersizYap(arr);

    }

    private static Integer[] benzersizYap(Integer[] arr) {
        Set<Integer>benzersizSet = new TreeSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        // Set de index yapısı yoktur,dolayısıyla forloop kullanamayız

        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index = 0;
        for (Integer each:benzersizSet
             ) {
            arr[index]=each;
            index++;
        }

        return arr;
    }
}
