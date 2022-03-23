package day13_stringManipulation;

public class C02_subString {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuç ssayısı 100 den çok ise super
        // az ise "az sonuç bulundu"

        String str="1-48 of 104 results for \"nutella\"";

        int ilkSpace=str.indexOf("");// 4
        int ikinciSpace=str.indexOf("",ilkSpace+1);
        int ucuncuSpace=str.indexOf("",ikinciSpace+1);

        String aramaSonucsayısıStr=str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucsayısıInt=Integer.valueOf(aramaSonucsayısıStr);

        if(aramaSonucsayısıInt>100){
            System.out.println("Super");
        }else{
            System.out.println("az sonuç bulundu");
        }



    }
}
