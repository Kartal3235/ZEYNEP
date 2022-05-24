package day51_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHArfSayisiniBulma {

    /*
 Soru 1 ) Verilen bir String’deki harfleri
 ve harflerin kacar kez kullanildigini return eden bir method yaziniz
 Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
  */
    public static void main(String[] args) {
        String input="Hellooooooooo";
        String harflerArr[]=input.split("");
        System.out.println(Arrays.toString(harflerArr));
        Map<String,Integer> kullanimSayilari = new HashMap<>();
        for (String each: harflerArr
        ) {
            if (kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each , kullanimSayilari.get(each)+1 );
            } else {
                kullanimSayilari.put(each,1);
            }
        }
        System.out.println(kullanimSayilari);
    }
}
