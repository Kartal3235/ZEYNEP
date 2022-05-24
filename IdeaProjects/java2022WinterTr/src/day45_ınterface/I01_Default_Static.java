package day45_ınterface;

public interface I01_Default_Static {

    /*
    Interface lerde sadece abstract methodlar bulunur.

    Body si olan concrete bir method oluşturmak istediğimizde Java CTE verir.

    Ancak Java8 ve üzeri versiyonlarda istisnai olarak
    static veya default olarak tamamlanan methodların bodysi olabilir.
    Ancak burada kullanılan default keyword u access modifer değildir.
    çünkü interface lerde tüm methodlar public abstract tı.

    aşağıdaki örnekte görüleceği gibi default olarak tanımlanmış bir methoda
    access modifer olarak public yazabilirsiniz.
    (access modifer yazmasak da Java methodu public olarak kabul edecektir.)
     */

    void method1();
    public default void method2(){
        System.out.println("ınterface deki defaault method");


    }
     static void method3(){
        System.out.println("Interface deki static method");//static methodlar override edilmez
    }
}
