package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();

       // System.out.println(ll1.element());// boşken kullanırsak ezception fırlatıyor.
        System.out.println(ll1.peek());// boş iken bize null döndürür.

        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

        ll1.poll();// ilk elementi silip,bize döndürür
                    // ilk elementi bulamazsa exception fırlatır.

        ll1.push(30);// Listenin başına ekler.
        ll1.push(20);
        System.out.println(ll1);//[20,30]

        ll1.remove();// ilk elementi siler ve bize döndürür.
        System.out.println(ll1.remove());

        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);// object olarak 50 yi siler
        ll1.push(25);

        System.out.println(ll1);
        ll1.removeLastOccurrence(40);

        ll1.push(35);
        System.out.println(ll1);




    }
}
