package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {


        String str="Java cok guzel";
        System.out.println(str.hashCode());//-481588044

        String str2="Hava cık guzel";
        System.out.println(str2.hashCode());//-667682188

        Set<Integer> sayiKumesi=new HashSet<>();
        sayiKumesi.add(10);
        System.out.println(sayiKumesi.hashCode());//10
        sayiKumesi.add(20);
        System.out.println(sayiKumesi.hashCode());//30
    }
}
