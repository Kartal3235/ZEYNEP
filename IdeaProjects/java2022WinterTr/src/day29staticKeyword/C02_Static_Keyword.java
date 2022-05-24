package day29staticKeyword;

public class C02_Static_Keyword {
    public static void main(String[] args) {

        // Başka class daki static class üyelerine
        // ulaşabilmek için sadece clasIsmi.staticUyeIsmi yazmamız yeterlidir.

        System.out.println(C01_Static.okulTelefonu);//3122563635
        C01_Static.okulTelefonu="3125474747";
        System.out.println(C01_Static.okulTelefonu);//3125474747


        //// Baqska class daki static olmayan class üyelerine
        // ancak o class dan obje oluşturarak ulaşabiliriz
        // ve obje ile yapılan atamalar sadece o obje için gecerli olur

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();

        System.out.println(obj2.okulİsmi);// Yildiz Koleji

        obj2.okulİsmi="Sabir Koleji";

        System.out.println(obj1.okulİsmi);//Yildiz Koleji



    }
}
