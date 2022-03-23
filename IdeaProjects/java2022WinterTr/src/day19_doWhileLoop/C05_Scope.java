package day19_doWhileLoop;

public class C05_Scope {

    // Bir method içinde oluşturulan variable lar sadece oluşturuldukları method da kullanabilirler
    // başka method larda kullanılamazlar
    // tüm method ların kullanılabilmesini istediğimiz variableları
    // Class level da oluştururuz
    // Class level da oluşturduğumuz variable'i
    // --- static yaparsak tüm methodlar kullanabilir
    // --- static olmazsa(instance) o zaman sadece static olmayan methodlar kullanabilir.
    // Loop içinde oluşturulan variable lar loop içerisinde kullanılabilir
    // ama loop un dışında kullanılamaz.

    static String kurs="Java";
    int level=10;


    public static void main(String[] args) {

        int sayi=10;

        //isim="Veli yAN";
        System.out.println(kurs);
        //System.out.println(level);

        for (int i = 0; i <10 ; i++) {

        }

    }

    public static void method1(){
        //sayi=20;
        String isim="Ali Can";

    }

    public void method2(){
        //sayi=30;
        //isim="Ayşe San";
        System.out.println(level);
        System.out.println(kurs);


    }

}
