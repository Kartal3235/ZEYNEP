package day15_metdCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {


        // Stringi yazdıran method oluşturalım

        //Hoşgeldiniz diyen bir method oluşturun

        // kapanma mesajı yazan bir method oluşturalım


        hoşgeldinYazdır();
        stringYazdır("Java gün geçtikçe güzelleşiyor");
        kapanmaMethodu();

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz");
    }

    public static void hoşgeldinYazdır() {
        System.out.println("Hoşgeldin");

    }

    private static void stringYazdır(String str) {
        System.out.println(str);
    }
}
