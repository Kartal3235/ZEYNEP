import java.util.Scanner;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir fiyat giriniz:");
        int fiyat=scan.nextInt();

        if(fiyat>0){
            if(fiyat<=10){
                System.out.println("ucuz");
            }else if(10<fiyat&&fiyat<20){
                System.out.println("normal");
            }else if(20<=fiyat){
                System.out.println("pahalı");
            }

        }else{
            System.out.println("hatalı giriş yaptınız");
        }



    }
}
