package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {


        boolean doğruMu=true;
        //String str=doğruMu; //sol String sağ boolean olunca kabul etmiyor


        byte sayi1=44;

        System.out.println(sayi1);

        short sayi2=sayi1; // eşitliğin solu short,sağı ise byte olmasına rağmen java itirazs etmiyor
                            // değer olarak atanan data türü variables data türünden küçük olduğu için java sorun yapmaz
                            // buna Auto Widening denir
        System.out.println(sayi2);


        double sayi3 = sayi2;

        System.out.println(sayi3);



    }
}
