import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Sınav notunuzu giriniz:");
        int not = scan.nextInt();

        if (not > 0&& not<100) {


            if (not >= 90 && not <= 100) {
                System.out.println("Sınavdan alacağınız harf değeri:A");

            } else if (not >= 80 && not <= 89) {
                System.out.println("Sınavdan alacağınız harf değeri:B");
            } else if (not >= 70 && not <= 79) {
                System.out.println("Sınavdan alacağınız harf değeri:C");
            } else if (not >= 60 && not <= 69) {
                System.out.println("Sınavdan alacağınız harf değeri:D");

            } else if (not >= 0 && not <= 59) {
                System.out.println("Sınavdan alacağınız harf değeri:E");
            }


        }else{
            System.out.println("Hatalı giriş yaptınız");
        }

    }
    }


    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */



