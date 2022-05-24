package day30passByValue;

public class C01_StaticBlocks {

    static {// Class çalışmaya başlamadan yapmamız gereken ön atamalar varsa onları yapar

        /* static block class ilk çalışmaya basladığında devreye girer ve classın çalıoşması için gerekli ön hazırlıkları
         için kullanılır,yazıldığı satırın hiç bir önemi yoktur, class içerisinde istenen yerde yazılabilir
         static block birden fazla olursa, bloklar yukarıdan asağı doğru sırayla çalışır
         */


        System.out.println("static bolck calıştı");

    }
    C01_StaticBlocks(){

        System.out.println("Constructor calıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangıcı");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();// constructor parantezi nerde görürsen orda çalışır
        System.out.println("main method sonu");
    }
}
