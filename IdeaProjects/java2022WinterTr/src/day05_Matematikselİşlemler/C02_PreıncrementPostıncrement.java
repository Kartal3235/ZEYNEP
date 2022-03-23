package day05_Matematikselİşlemler;

public class C02_PreıncrementPostıncrement {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2= sayi1++;
        System.out.println(sayi1+","+sayi2+ ","+sayi3);


        sayi3=++sayi1;

        System.out.println(sayi1+","+sayi2+ ","+sayi3);

        System.out.println(sayi3++);//önce yazdıracak sonra artıracak
                                    //önce  12 yazdıracak sonra sayi3=13

        System.out.println(--sayi2);//önce azalt saonra yazdır
                                    // önce sayi2=9 sonra sayi2 nin som değeri yazdırır






    }
}
