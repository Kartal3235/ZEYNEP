package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("Child cons. calıştı");
    }


    // Extends keyword kullanan
    // Tum classlarda biz göremesekde
    // Javanın oluşturduğu default constructor vardır.

    //Tüm CONSTRUCTOR ların ilk satırında
    // biz görmesek bile super()
    //constructor call vardır.
    // yani parent classın parametresiz cons. call


    public static void main(String[] args) {

        Child child = new Child();

    }
}
