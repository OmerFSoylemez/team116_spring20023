package day07_switchStatements_StringManibulation;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir rakam yazınız");
        int rakam = scanner.nextInt();

        switch (rakam){

            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Geçerli bir rakam giriniz");


        }
    }
}
