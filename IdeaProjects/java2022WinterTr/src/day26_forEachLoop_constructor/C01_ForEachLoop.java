package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {


        int arr[]={2,4,6,8,11};

        // elementleri for loop ile yazdıralım

        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]+" ");
        }

        System.out.println("");

        // Bunu for - each loop ile yapacak olursak
        // for - each loop u çalıştırmak için hedef bir collection vermeliyiz

        for (int each: arr
             ) {

            System.out.print(each + "" );

        }

        // avantajı : index, baslangıç değeri, bitiş değeri gibi detaylarla
        // uğraşmamıza gerek kalmadan collections dan tüm elemneleri bize getirir
        // dezavantajı : index e bağlı bir işlem yapamayız


    }
}
