package day22_Arrays;

public class C08_Split {
    public static void main(String[] args) {


        // Verilen bir cümlede istenen bir harfin kaç defa kullanıldığını yazdıran bir method oluşturun

        String cumle="Nerede o hello world yazdıramayan ogrenciler";

        String harf="e";

        harfKacKereKullanilmis(cumle,harf);

    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {


        int sayac=0;

        String karakterler[]=cumle.split("");

        for (int i = 0; i <karakterler.length ; i++) {

            if(karakterler[i].equals(harf)){

                sayac++;
            }

        }
    }
}
