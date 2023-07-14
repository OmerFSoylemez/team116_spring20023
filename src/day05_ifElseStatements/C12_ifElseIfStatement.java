package day05_ifElseStatements;

import java.util.Scanner;

public class C12_ifElseIfStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin,
        //        sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        //        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        //        Hem 3 hemde 5 e bölünüyorsa SUPER yazdirin.
        //        İkisine de bölünemeyen sayılar için YAZIK yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi%3 ==0 && girilenSayi %5 == 0) {
            System.out.println("SUPER");
        } else if (girilenSayi%3 == 0) {
            System.out.println("Üç ile bölünebilen sayi");
        } else if (girilenSayi %5 == 0) {
            System.out.println("Beş ile bölünebilen sayı");
        }else {
            System.out.println("YAZIK");
        }
    }
}
