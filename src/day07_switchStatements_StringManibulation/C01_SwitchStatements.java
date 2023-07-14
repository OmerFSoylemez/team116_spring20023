package day07_switchStatements_StringManibulation;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        //Soru 2-Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        //       NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //       Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yazdırmak istediğiniz ayın ilk harfini giriniz");

        char ilkHarf = scanner.next().toUpperCase().charAt(0);

        switch (ilkHarf){

            case 'O' :
                System.out.println("Ocak");
                break;
            case 'S' :
                System.out.println("Subat");
                break;
            case 'M' :
                System.out.println("Mart veya Mayıs");
                break;
            case 'N' :
                System.out.println("Nisan");
                break;
            case 'H' :
                System.out.println("Haziran");
                break;
            case 'T' :
                System.out.println("Temmuz");
                break;
            case 'A' :
                System.out.println("Agustos veya Aralık");
                break;
            case 'E' :
                System.out.println("Eylül veya Ekim");
                break;
            case 'K' :
                System.out.println("Kasım");
                break;
            default:
            System.out.println("geçersiz harf");
        }

    }
}