package day20_sope_Arrays;

public class C02_StaticVarıable {

    static String okulIsmi="Yıldız Koleji";
    static int okulNo;
    static boolean okulAcıkMı;


    public static void main(String[] args) {

        System.out.println(okulIsmi);
        System.out.println(okulNo);
        okulNo=102;
        System.out.println(okulNo);
        System.out.println(okulAcıkMı);

    }

    public static void staticMethod(){


    }

}
