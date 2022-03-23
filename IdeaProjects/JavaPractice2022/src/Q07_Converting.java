import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {


        double gallon=3.785;
        double litre=1/3.785;
        System.out.println("gallon:"+3.785+"\nlitre:"+1/3.785);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen galon değeri giriniz");

        double değer=scan.nextDouble();
        double değer1=3.785*değer;

        System.out.println("değer1:"+değer1+" "+"litredir");
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen litre değeri giriniz");

        double değer3= scan.nextDouble();
        double değer4=(değer3)/3.785;
        System.out.println("değer4:"+değer4+" "+"galondur");

    }
    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */



}
