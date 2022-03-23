import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String1:");
        String str1=scan.nextLine();
        System.out.println("String2:");
        String str2=scan.nextLine();

        System.out.println(str1.concat(str2));

        String str1ilksiz=str1.substring(2);
        String str2ilksiz=str2.substring(2);

        System.out.println("Stringlerin ilk harfsiz halleri:"+str1ilksiz+" "+str2ilksiz);

    }
}
