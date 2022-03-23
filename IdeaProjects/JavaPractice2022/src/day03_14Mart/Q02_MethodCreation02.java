package day03_14Mart;

public class Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {

    birKereYazdir("aabbcccccddddaaa");



}

        private static void birKereYazdir(String str) {

            String sonuc="";

            for (int i = 0; i <= str.length()-1; i++) {

                 if (!sonuc.contains(str.substring(i,i+1)));{

                    sonuc+=str.substring(i,i+1);
                }

            }
        }


}
