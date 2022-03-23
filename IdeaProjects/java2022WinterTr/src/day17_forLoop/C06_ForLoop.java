package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Verilen iki harf ve aralarındaki harfleri yazdıran
        //bir kod yazınız.

        char ilkHarf='c';
        char sonHarf='s';

        for (char i = ilkHarf; i <sonHarf; i++) {

            System.out.print(i+" ");
        }

        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;

        //Başlangıç ve bitiş sayıları arasında artış miktarı ile oluşacak tüm sayıları yazdırın.

        for (double i = baslangıc; i < bitis; i+=artıs) {
            System.out.print(i+"");

        }

    }
}
