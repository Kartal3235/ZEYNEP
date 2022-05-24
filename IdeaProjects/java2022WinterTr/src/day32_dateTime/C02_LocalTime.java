package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();

        System.out.println(tm);

        // Bir işlemin ne kadar sürede bittiğini bulmak istersek
        //işlemden
        //aradaki farkı hesaplayabiliriz
        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tm);

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem"+(nano2-nano1)+ "nano saniyede bitti");


        // ileri veya geriye gidebiliriz
        System.out.println(tm.plusMinutes(1000));

      // istersek zone id kullanarak istewdiğimiz bölgenin saati içinde obje oluşturabiliriz

    }
}
