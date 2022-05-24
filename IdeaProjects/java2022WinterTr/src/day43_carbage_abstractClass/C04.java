package day43_carbage_abstractClass;

public  abstract class C04 {

    /*
    Bir abstract class da abstract veya concrete methodlar bulunabilir.
    Child classların abstract methodları override etmesi MECBURİ iken
    concrete methodların override edilmesi OPSİYONEL dir.
     */

    public abstract void absmethod();

    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }
    public static void concretestaticMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*
        Abstract classlar constructara sahiptir.
        ancak Abstract classlardan OBJE OLUŞTURULAMAZ.

        Abstract classlar OBJE BARINDIRMAYAN sadece child classlar için
        UYULMASI ŞART OLAN veya OPSİYONEL bırakılan özellikleri tanımladığımız
        bir depo class gibidir.

         */

        //C04 obj=new C04();

        System.out.println("bu class abstract");

    }
}
