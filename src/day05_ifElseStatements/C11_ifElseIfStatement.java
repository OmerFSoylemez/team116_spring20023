package day05_ifElseStatements;

import java.util.Scanner;

public class C11_ifElseIfStatement {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin,
        //        sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        //        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //        Hem 3 hemde 5 e bölünüyorsa SUPER yazdirin.

        /*
        NOT: Çoklu if else blokları
        else ile biterse tüm durumları kapsıyor demektir
        ve her durumde bir if body si çalışır.

        Ancak else ile bitmiyorsa bazı değerler için kodunuz çalışır
        ama hiç bir if body si çalışmayabilir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi%3 ==0 && girilenSayi %5 == 0) {
            System.out.println("SUPER");
        } else if (girilenSayi%3 == 0) {
            System.out.println("Üç ile bölünebilen sayi");
        } else if (girilenSayi %5 == 0) {
            System.out.println("Beş ile bölünebilen sayı");

        }
    }
}
