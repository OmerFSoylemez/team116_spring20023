package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan notunu alin
        //         50 veya daha buyukse "Sinifi Gectin",
        //         50’den kucukse "Maalesef kaldin" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scanner.nextDouble();

        System.out.println(not>=50 ? "Sınıfı geçtin" : "Maalesef kaldin");


    }
}
