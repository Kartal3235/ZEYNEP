package day23_multıDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {


        // Boyutları belirli bir array i elementleri girmeden oluşturalım

        // bir okulda içinde 24 öğrenci olan 8 sınıf vardır

        int array[][] =new int[8][24];

        // bir ilçede her birinde 24 öğrencilik 8 sınıf bulunan 5 okul vardır

        int ilce[][][]=new int[5][8][24];

        // bir okulda 3 tane 24 kişilik, 2 tne de 22 kişilik sınıf vardır

        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];


        // Manuel olarak elementleri atama yaparsak farklı uzunlukta inner arraylar tanımlayabiliriz

        int arr[][]={{3,1,7},{6,10,2}};

    }
}
