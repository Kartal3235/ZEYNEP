package day15_metdCreation;

public class C04 {

    // Main method olmadan da bir class oluşturulabilir
    // Ancak bu class direk çalışmaz
    // sadece depo görevi görür
    // başka class lardan kullanabilecek method veya variable

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
}



