package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){

        if (yakit .equals("Benzin")){
            System.out.println("Benzinli araçlar max 240km hız yaparlar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dizel araçlar max 260km hız yaparlar");
        }
    }

    public void renkTercihleri(){

        if (model.equals("Corolla")){

            System.out.println("Corolla renk secenekleri kırmızı ve beyaz");
        }else if (model.equals("Yaris")){
            System.out.println("");
        }
    }



}
