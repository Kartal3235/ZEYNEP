package day45_ınterface;

public class C02_Default_satatic_method implements I01_Default_Static{

    /*
    Bir ınterface de default veya static tanımlanan ve bodysi olan
    methodların override edilmesi mecburi DEĞİLDİR..
    Eğer static olarak tanımlanmışsa zaten override edemeyiz.
     */
    @Override
    public void method1() {
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        //Interface de static olan tanımlanan methodlara
        //static yöntemllerle ulaşılabilir.
        //InterfaceIsmi.methodIsmi
        I01_Default_Static.method3();

        C02_Default_satatic_method obj= new C02_Default_satatic_method();
        obj.method1();//child class
        obj.method2();//parent Interface
        //obj.method3();//eski classlarda static bir uyeye static olamyan yollarlada ulaşabilirdik
                     //ancak ınterface içerisinde static olarak tanımlanan methoda
                     // static olmayan yöntemlerle ulaşılamaz.
    }
}
