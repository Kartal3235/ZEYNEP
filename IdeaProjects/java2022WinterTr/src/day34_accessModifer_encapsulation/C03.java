package day34_accessModifer_encapsulation;

public class C03 {

    // encapsule edeceğimiz iki variable olsun


    private int sayi;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getSayi() {
        return sayi;
    }

    @Override
    public String toString() {
        return "C03{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;


    }
}

