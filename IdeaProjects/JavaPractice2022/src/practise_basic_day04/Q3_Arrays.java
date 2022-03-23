package practise_basic_day04;

import java.util.Arrays;

public class Q3_Arrays {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */

        // 1.adım:str tanımladık
        String str="HeySiri";

        //2. adım: str yi ByeSiri ye dönüştür

        str=str.replace("Hey","Bye");

        // 3.adım : arr oluştur

        String[]arr=new String[1];

        arr[0]=str;

        System.out.println(Arrays.toString(arr));

    }
}
