package day14_subStringManıplation;

public class C01_trim {
    public static void main(String[] args) {

        String str="  Siz ne derseniz deyin Java bildiğini okur.  ";
        System.out.println(str);
        System.out.println(str.length());

        System.out.println(str.trim());
        System.out.println(str.trim().length());

        str="ali okula git \ngit ali git";
        System.out.println(str);


    }
}
