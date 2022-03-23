package day09_ternary_Swich;

public class C05_ternary {
    public static void main(String[] args) {

        //Bazen ternary deki iki sonucun data türleri farklı olabilir

        // verilen sayı 100 den büyükse sayı nın karesini alıp yazdıran
        // 100 den küçükse sayı "100 den büyük olmalı" yazdıran bir ternary oıluşturalım

        int sayi=50;
        // ternary biz<e sonuç getirdiğinden ya sonuçu direk yazdırmalıyız
        //veya bir değişkene atamalıyız
        //eğer sonuçlar farklı data türlerinde ise
        //atama yapacağımız variable ın data türü tek olacağından
        //atama yapamayız
        //SADECE direk yazdırmalıyız

        System.out.println(sayi>100? sayi*sayi:"sayi 100 den büyük olmalı");

    }
}
