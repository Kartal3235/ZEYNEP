package day09_ternary_Swich;

public class C03_ternary {
    public static void main(String[] args) {

        int sayi=1210;
        // vereilen sayının 3 veya daha çok basamaklı olup olmadığını kontrol eden
        // ve sonucu yazdıran bir ternary yazın

        String sonuc=sayi>=100 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamaktan küçük";


        //ternary bize sonuç döndürdüğü için
        // ya bu sonucu direk yazdırmalıyız
        // yada sonucun  data türüne uygun bir variable a atama yapabiliriz
        System.out.println("girdiğiniz sayi analizi:"+ sonuc);
    }
}
