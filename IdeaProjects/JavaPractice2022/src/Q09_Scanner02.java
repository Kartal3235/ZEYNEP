import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Adınızı giriiniz:");
        String adınız= scanner.nextLine();
        System.out.println("Lütfen soyadınızı giriniz:");
        String soyisim=scanner.nextLine();
        System.out.println("Memleketinizi giriniz:");
        String memleket=scanner.nextLine();
        System.out.println("Konumunuz:");
        String konumun=scanner.nextLine();
        System.out.println("yaşınız:");
        String yaşınız=scanner.nextLine();
        System.out.println("Boyunuzun ölçüsünü giriniz:");
        double Boyun=scanner.nextDouble();


        }


    }
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line





