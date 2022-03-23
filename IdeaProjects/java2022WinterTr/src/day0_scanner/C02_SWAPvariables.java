package day0_scanner;

public class C02_SWAPvariables {
    public static void main(String[] args) {
       /* //1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        // Orn  : sayi1=10 ve sayi2=20;
        //  kod calistiktan sonra
        //  sayi1=20 ve sayi2=10

        int sayi1=10;
        int sayi2=20;
        System.out.println("Swaptan önce sayi1: "+sayi1+",sayi2: "+sayi2);

        int temp=sayi1;

        sayi1=sayi2;

        sayi2=temp;
        System.out.println("Swaptan sonra sayi1: "+sayi1+",sayi2: "+sayi2);
*/


        int sayi=20;
        int sayi1=30;
        System.out.println("Swaptan önce sayi:"+sayi+",sayi:"+sayi1);

       int temp=sayi;
        sayi=sayi1;
        sayi1=temp;

        System.out.println("Swaptan sonra sayi:"+sayi+",sayi1:"+sayi1);




    }
}
