package day10_swicth_StringManipulation;


public class C03_Concate {
    public static void main(String[] args) {

        //Concatenation yapmak için iki ihtimalimiz var
        //istersek daha önve yaptığımız gibi + operatörünü kullanabiliriz
        //veya String class ından gelen



       /* String str1="Java";
        String str2="Candır";
        //Java boşluk Candır yazdıralım
        System.out.println(str1+" "+str2);

        String cumle=str1.concat(str2);//str1 yazdıracak sonrasına str2 yapıştıracak
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        //concate metodu içine String parametre ister
        //String dışında bir data turu yazdığınızda onu String haline getirmelisiniz

        */

        String str1="Java";
        String str2="candır";
        String cumle=str1.concat(str2);
        System.out.println(cumle);



    }
}
