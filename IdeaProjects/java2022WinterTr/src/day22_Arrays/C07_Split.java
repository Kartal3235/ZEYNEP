package day22_Arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {


        String str="Java gün gectikce guzellşiyor";

        String kelimeler[]=str.split(" ");

        System.out.println(Arrays.toString(kelimeler));

        System.out.println(kelimeler[1]);

        String gectikce[]=str.split("gectikce");

        System.out.println(Arrays.toString(gectikce));

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));




    }
}
