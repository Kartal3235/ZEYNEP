package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        /*
        List den gelen özellikleri biliyoruz
        onun için Deque'den gelen özlliklere bakalım
         */

        Deque<Integer> ll1=new LinkedList<>();

        ll1.addFirst(10);//basa element ekler
        ll1.addLast(15);// sona ekler.
        System.out.println(ll1.element());//İlk elementi silmeden bize döndürür,
                                          //İLk element yoksa bize exception fırlatır.

        System.out.println(ll1);

        System.out.println(ll1.getFirst());//İlk elementi silmeden bize döndürür
        System.out.println(ll1.getLast());//Son elementi silmeden bize döndürür
        System.out.println(ll1);

        ll1.offerFirst(30);
        System.out.println(ll1);
        ll1.offerLast(50);// Sona ekler ve bize true döndürür.
        System.out.println(ll1);

        System.out.println(ll1.peek());//İlk elementi silmeden bize döndurur,
                                        //Bulamazsa NULL dondurur.

        ll1.poll();

    }
}
