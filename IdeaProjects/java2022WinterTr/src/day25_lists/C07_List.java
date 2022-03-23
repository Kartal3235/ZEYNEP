package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {

        // Bir listede ortalamanın üstünde olan element sayısını bulunuz.

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        // ortalamayı bul

        Double ortalama=0.0;
        Double toplam=0.0;

        for (int i = 0; i <sayilar.size() ; i++) {
            toplam+=sayilar.get(i);


        }
        ortalama=toplam/sayilar.size();
        System.out.println(ortalama);

        // ortalamanın ustunde olanları bir liste at

        for (int i = 0; i <sayilar.size(); i++) {

            if (sayilar.get(i)>ortalama){
                Double ortalamaninUstunde = sayilar.get(i);
            }
        }

        }

    }

