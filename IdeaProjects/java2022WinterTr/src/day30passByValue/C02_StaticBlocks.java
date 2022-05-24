package day30passByValue;

public class C02_StaticBlocks {

    {

        /*static olmayan bloklar ise obje oluşturulrken çalışır

        static bloıklar sadece 1 kere en başta çalışır ama
        static olmayan bloklar her obje oluşturulurken yeniden çalışır
         */

        System.out.println("static olmayan blok çalıştı");

    }

    static{

        System.out.println("static olmayan blok çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method bası");

        C02_StaticBlocks obj=new C02_StaticBlocks();
        C02_StaticBlocks obj1=new C02_StaticBlocks();
    }
}
