package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {


        // verilen iki sayıyı toplayan bir method oluşturun

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        // bir de Üç sayıyı toplayan method oluşturalım

        toplaGel(sayi1,sayi2);
        toplaGel(sayi1,sayi2,sayi3);

    }

    private static void toplaGel(int sayi1, int sayi2, int sayi3) {
    }

    private static void toplaGel(int sayi1, int sayi2) {

        System.out.println(sayi1+sayi2);
    }
    

    
}
