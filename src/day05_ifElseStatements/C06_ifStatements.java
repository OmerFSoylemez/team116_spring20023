package day05_ifElseStatements;

import java.util.Scanner;

public class C06_ifStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin
        //        50 veya daha buyukse “Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if(not>=50) System.out.println("Sınıfı Geçtin");

        if (not<50) System.out.println("Malesef Kaldın");

        /*
        Önceki sorulardan farklı olarak
        bu iki soruda iki if birbirine bağımlıdır.
        iki if den sadece 1 i çalışır.
        ikisininde birden çalışma ihtimali yoktur
        ikisininde çalışmama ihtimali de yoktur.
         */


        if(not>=50) {
            System.out.println("Sınıfı Geçtin");
        }else {
            System.out.println("Malesef Kaldın");
        }

        /*
        if ve else body'leri tek bir boolean şarta bağlıdır
        iki if den sadece 1 i çalışır.
        ikisininde birden çalışma ihtimali yoktur
        ikisininde çalışmama ihtimali de yoktur.
         */
    }
}
