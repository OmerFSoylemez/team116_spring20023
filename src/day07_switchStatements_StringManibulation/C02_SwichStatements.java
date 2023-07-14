package day07_switchStatements_StringManibulation;

import java.util.Scanner;

public class C02_SwichStatements {
    public static void main(String[] args) {

        //Soru 2-Kullanicidan  ay numarasını alın
        //       o ayın hangi mevsimde olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarası giriniz");

        int ayNO = scanner.nextInt();

        switch (ayNO) {

            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("geçersiz ay numarası");
        }
    }
}