package practise_basic_day04;

public class Q4_Arrays {
    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        /*
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9
			 */


        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i <arr.length ; i++) {//arr kontrol

            for (int j = i+1; j <arr.length ; j++) {//2.sayı alıyoruz

                if (arr[i]+arr[j]==istenenToplam){
                    System.out.println(arr[i]+"ve"+arr[j]+"toplamı:"+istenenToplam);
                }

            }

        }
    }
}




