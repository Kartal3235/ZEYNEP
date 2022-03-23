package day12_stringManipulation;

public class C04_endWith {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr

        String email= "mulkiyeayboy@gmail.com";
        String arananMetin= "@gmail.com";

        if(!email.contains(arananMetin)){
            System.out.println("Lütfen gmail giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi");
        }else{
            System.out.println("lütfen yazımı kontrol edin");
        }


    }
}
