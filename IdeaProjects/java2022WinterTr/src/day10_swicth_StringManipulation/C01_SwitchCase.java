package day10_swicth_StringManipulation;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        //kullanıcıdan sayı olarak kaçıncı ay numarasını alıp
        //istenen ay ismini yazdıran bir program yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz");

        int ayNo=scan.nextInt();
        //Bu soruyu if elsae ile yapabiliriz ama art arda 12 if else çok kalabalık
        //ve anlaşılması güç olabilir
        //bunun yerine swsitch case yapısını kullanabiliriz

        switch (ayNo){

            case 1:
                System.out.println("ocak");
                break;
                case 2:
                    System.out.println("şubat");
                    break;
                    case 3:
                        System.out.println("mart");
                        break;
                        case 4:
                            System.out.println("nisan");
                            break;
                            case 5:
                                System.out.println("mayıs");
                                break;
                                case 6:
                                    System.out.println("haziran");
                                    break;
                                    case 7:
                                        System.out.println("temmuz");
                                        break;
                                        case 8:
                                            System.out.println("ağustos");
                                            break;
                                            case 9:
                                                System.out.println("eylül");
                                                break;

                                                case 10:
                                                    System.out.println("ekim");
                                                    break;
                                                    case 11:
                                                        System.out.println("kasım");
                                                        break;
                                                        case 12:
                                                            System.out.println("aralık");
                                                            break;

            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz");

        }
        //switch içine yazılan variable ın değerine göre
        //ilgili case i bulur ve break görene kadar kodu çalıştırır
        //eğer break yoksa ilgili case den aşağıya doğru çalıştırır




    }
}
