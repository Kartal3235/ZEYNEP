package day05_Matematikselİşlemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //verilen iki string deki sayıları toplayın


        System.out.println(str1+str2);//1234523456

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
        //Integer.valueOf(str1) methodu sadece sayısal değer içeren String lerde kullanabilir
        //bir tane bile sayı dışında karakter olursa Java hata verir



    }
}
