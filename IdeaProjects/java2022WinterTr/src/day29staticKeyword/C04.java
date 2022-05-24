package day29staticKeyword;

public class C04 {

    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

            C03.artirma();// Method call(C03 den çağrıyor)
        }
        System.out.println(C03.sayi);
    }
}
