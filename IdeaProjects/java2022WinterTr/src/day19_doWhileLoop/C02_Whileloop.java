package day19_doWhileLoop;

public class C02_Whileloop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve
        // bu sayinin rakamlari toplamini yazdirin

        int input=1897;
        int rakam=0;
        int rakamlartoplami=0;

        while(input>0){

            rakam=input%10;
            rakamlartoplami+=rakam;
            input/=10;

        }
        System.out.println(rakamlartoplami);

    }
}
