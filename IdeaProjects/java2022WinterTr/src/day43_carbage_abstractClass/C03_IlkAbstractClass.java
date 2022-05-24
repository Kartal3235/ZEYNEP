package day43_carbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void abstractMethod();

    /*
    Abstract Methodlar child class ların mutlaka override etmesi gereken methodlardır.
    Dolayısıyla HİÇBİR ZAMAN direk çalıştırılmazlar.
    ve bu sebeple method body sine ihtiyaç yoktur.


    bir class ın veya methodun abstract olup olmadığını anlayabilir miyiz?
    -abstract yazıyorsa abstracttır,yazmıyorsa değildir.

    Abstract olmayan classlara CONCRETE class/method denir.

    Abstract methodlar body e sahip olamaz
    Concrete methodlar ise method body si olmadan oluşturulamaz
     */
}
