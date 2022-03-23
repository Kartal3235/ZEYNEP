package day07_ıfElseStatements;

public class C01_ifStatemans {
    public static void main(String[] args) {

        int a=2;
        int b=3;

        if (a==b){

            System.out.println("verilen sayılar eşit");
        }

        if (a<100){
            System.out.println("a yüzden büyük");
        }
        if (a*b>1){
            System.out.println("sayıların çarpımı beşten büyük");

        }
        //bağımsız if cümleleri kendi leri dışında kodlamalarla ilgilenmezler
        //bir şart ve o şarta bağlı sonuca odaklıdır
        //birden fazla bağımsız if cümlesi olduğunda hepsinin body çalışabileceği gibi hiçbirisinin body si çalışmayada bilir

    }
}
