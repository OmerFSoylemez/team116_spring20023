package day05_ifElseStatements;

import java.util.Scanner;

public class C05_ıfStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ucgenin kenar uzunluklarının giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1== kenar2 && kenar2 ==kenar3 && kenar3>0) {
            System.out.println("Girilen değerler eskenar ucgen olusturur");
        }


    }
}
