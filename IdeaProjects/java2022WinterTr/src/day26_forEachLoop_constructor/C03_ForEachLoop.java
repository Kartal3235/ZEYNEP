package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {

        //iki String array olusturunuz
        // ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String array1[]={"Ali","Ayşe","Can","Fatma"};

        String array2[]={"Can","Evren","Emsal","Fatma","Emre"};

        List<String> ortakElemanlar=new ArrayList<String>();

        for (String each1:array1
             ) {

            for (String each2:array2
                 ) {

                if (each1.equals(each2));

                ortakElemanlar.add(each1);
            }
        }

        if (ortakElemanlar.isEmpty()){
            System.out.println("Ortak Eleman yok");
        }else{

            System.out.println(ortakElemanlar);
        }
    }
}
