package day14_subStringManıplation;

public class C02_Tersten {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        String input="mavi";

        String terrsStr=input.substring(3).toUpperCase()+
                        input.substring(2,3).toUpperCase()+
                        input.substring(1,2).toUpperCase()+
                        input.substring(0,1).toUpperCase();



        System.out.println(terrsStr);



    }
}
