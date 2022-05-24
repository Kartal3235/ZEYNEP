package day49_maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDüzenleYazdirma {

    public static void main(String[] args) {

        //Sınıf listesini düzenli bir şekilde yazdırmak

        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara isim Soyisim Brans");
        System.out.println("==========================");

        //Map yapısından yazdırdığımızda kullanıcılar bir şey anlamayabilir.
        //Bunun için önce map yapısını kodlarla manıpule edip
        //map deki dataları, istediğimiz formata sokmamız gerekir.
        // 1.adım key ve value ları map den alıp
        // iki farklı collection üyesine atadık

        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each:valueSet
             ) {
            System.out.println(each);
        }


    }
}
