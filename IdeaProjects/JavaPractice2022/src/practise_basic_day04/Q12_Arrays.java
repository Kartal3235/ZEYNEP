package practise_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_Arrays {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("oluşturmak istediğiniz listin uzunluğunu giriniz: ");

        int listUzunluk=scan.nextInt();

        List<Integer> list=new ArrayList<>();

        System.out.println("girdiğiniz list uzunluğu kadar eleman ekleyiniz..");

        for (int i = 0; i <listUzunluk ; i++) {

            list.add(scan.nextInt());

        }

        tekrarliEleman(list);
    }

    private static void tekrarliEleman(List<Integer> list) {

        List<Integer> tekrarlilist=new ArrayList<Integer>();

       /* for (int i = 0; i <ls.size(); i++) { // ilk listem

            for (int j = i+1; j <ls.size(); j++) {// diğer index leri karşılaştıracak

                if (ls.get(i)==ls.get(j)&&! tekrarlilist.contains(ls.get(i))) {

                    tekrarlilist.add(ls.get(i));*/
                }

            }





