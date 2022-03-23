package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_listedeElemanlarınYeriniDeğiştirme {
    public static void main(String[] args) {

        // verilen bir listede istenen iki index deki elementlerin yerini
        // kalıcı olarak değiştiren bir method oluşturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=3;


        sayilar=swapElements(sayilar,ilkIndex,ikinciIndex);
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir temp sayı oluşturup
        // verilen indexlerdeki sayiları yer değiştirin
        // indexleri kontrol edip sınırın ötesinde ındex verildiyse uyarı mesajı yazdırın



        return sayilar;
    }
}
