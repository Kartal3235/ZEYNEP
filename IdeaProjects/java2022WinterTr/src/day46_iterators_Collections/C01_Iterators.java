package day46_iterators_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();

        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        System.out.println(liste);

        Iterator itr=liste.iterator();// iterator methodunu oluşturduğumuz liste objesi
                                      // üzerinden ArrayList classından çalıştırıyoruz.

        /*
        iterator nasıl çalışır
        bir iterator objesi oluşturmak için collection üyesi bir
        obje kullanmalıyız.Yani biz bu iterator objesini bizim örneğimizde liste objesi üzerinde
        çalışmak için oluşturmuş olduk.
        Biz iterator objesini oluşturduğumuzda,iterator collection ın ilk elementinin öncesine
        gidip bekler.

        [(itr)5,6,7,8,9]

        itr.hasNext()=>true    iterator a yanında eleman var mı diye sorar,true veya false döndürür.

        itr.next();==>  iterator bir sonraki elementin yanına geçer, ve üzerinden geçtiği
                        elementi bize döndürür.
            itr.next();
          [5,(itr)6,7,8,9] //6

           itr.next();
          [5,6,(itr)7,8,9]//7


            itr.remove();==> iteraor ın elinde elementi sildi

            Dolayısıyla üst üste iki kere itr.remove(); KULLANILAMAZ

            önce itr.next(); methodunu çalıştırıp
            iterator ın bir element
         */

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//6
        System.out.println(itr.next());//7

        itr.remove();

        System.out.println(liste);

        itr.remove();

    }
}
