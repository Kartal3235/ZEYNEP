package day37_inharitance;

import day36_inheritance.Parent;

public class Child extends Parent {

    // Bir class ı child class yaptığımızda
    // parent class daki cons. ulaşması gerekir.
    // Bu durumda parent class daki  cons. access modiferi uygun bir modifer yapılmalıdır.


    //Child  class da tüm cons.ilk satırına
    // Java nın yerleştirdiği cons.PARAMETRESİZ dir yani super();

    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }

    Child(int s){
        System.out.println("child class parametreli cons.");
    }

    Child(int sayi1,int sayi2){

        // Eğer parent classdan parametresiz cons değilde
        // baska bir cons. çalıştırmak isterseniz
        // bunu Child class daki cons. İLK SATIRINA yazmalısınız.
        super(sayi1, sayi2);

        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {
        Child child = new Child(5,8);

    }
}
