package day16_MethodCreation;

public class C04_forLoop {
    public static void main(String[] args) {

        // verilen stringi tersten yazdıran bir kod yazınız

        String str="Valla bu java çok zevkli";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.substring(i,i+1));
        }

    }
}
