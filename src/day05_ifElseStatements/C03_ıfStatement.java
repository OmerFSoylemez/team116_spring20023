package day05_ifElseStatements;

import java.util.Scanner;

public class C03_ıfStatement {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin,
        //        sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        //        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3==0 ) System.out.println("üç ile bölünebilen sayi");
        if (girilenSayi % 5==0 ) System.out.println("beş ile bölünebilen sayi");
    }
}
