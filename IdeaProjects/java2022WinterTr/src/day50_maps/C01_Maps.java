package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        // siniftaki öğrenci listesini duzenli olarak yazdıralım

        Map<Integer,String> sinifListMap=MapOlustur.myMap();

        System.out.println(sinifListMap);

        /*
        Eğer key lere tek tek ulaşmak istersek
        index yapısına ihtiyacımız var
        ancak map index yapısını desteklemez
        Bunun için keyleri önce bir set e sonrada set' in tum elementlerini bir list 'e ekledik
         */

        Set<Integer> sinifKeySeti=sinifListMap.keySet();//siniflistMap de key ve valuler var//burda key'leri set' e attık
        List<Integer> keyList=new ArrayList<>();//List oluşturduk

        keyList.addAll(sinifKeySeti);// set' deki tüm key'leri list e attık
        System.out.println(keyList);


        // Şimdi value'leri index ile ulaşabileceğimiz bir şekle sokalım

        Collection<String> sinifValueColl=sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String>sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);

        /*
         Her bir value birden fazla bilgiyi içeriyor
         onun için valueleri multıdimensional bir array e atmak mantıklı duruyor.
         ancak MDA oluşturmak için boyutları bilmeye ihtiyacımız var
         */

        int outerArrayBoyut=sinifValueList.size();
        System.out.println(outerArrayBoyut);

        // inner arraylaerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(",");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            String temp[]=sinifValueList.get(i).split(",");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j]=temp[j];


            }

        }

        /*
         bu satıra kadar;
         =key'leri index ile ulaşabildiğim keylist'e atadım
         =valu'leri MDArr'e atadım
         =şimdi bu key ve valueleri istediğim gibi manuple edebilirim.
         */
        System.out.println("Numara isim Soyisim Brans");
        System.out.println("==========================");

        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print(keyList.get(i)+" ");

            for (int j = 0; j <innerArrayBoyut ; j++) {

                System.out.print(valueMDArr[i][j]+" ");

            }
        }
    }
}

