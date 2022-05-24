package day46_iterators_Collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {

        LinkedList<Integer>list=new LinkedList<>();

        list.add(5);
        list.add(10);// add methodu List'den geldiği için hep sona ekler.
        list.addFirst(11);// addFirst deque den gelir.
        list.addLast(12);// addLast deque den gelir.

        System.out.println(list);

        list.add(2,25);
        System.out.println(list);
    }
}
