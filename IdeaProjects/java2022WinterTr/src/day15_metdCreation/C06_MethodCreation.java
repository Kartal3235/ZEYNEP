package day15_metdCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;


        // iki variable ın değerlerini toplayan bir method oluşturalım
        // 1.adım method adını yazalım
        // 2.adım methoda göndermem gereken argüman var mı?


        ikiSayiTopla(25,50);

        C04.dortHarfiTersineCevir("sema");
    }

        // bir methodu oluşturmnak çalışması için yeterli değildir
        // method ancak çağrılırsa çalışır
        // aynı class veya farklı class da olmasının hiçbir önemi yoktur
        // Java mainb method da yukarıdan aşağıya doğru çalışır
        // ve geldiği satırı çalıştırır

    public static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen iki sayının toplamı:"+(a+b));


    }

}
