package practice_basic_day01;

import java.util.Scanner;

public class Q14_nested_Ternary {
    public static void main(String[] args) {

/*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Final Notunuzu giriniz:");
        double not=scan.nextDouble();

        if(not>0&&not<=100){

            if(not>=85&&not<=100){
                System.out.println("gayet başarılı:"+'A');}
            else if(not<85&&not>=70){
            System.out.println("Başarılı:"+'B');
        }else if(not<70&&not>=55){
            System.out.println("Ha gayret:"+'C');
        }else{
                System.out.println("Diğerleri");
            }

        }else{
            System.out.println("Hatalı giriş yaptınız");

    }
}}
