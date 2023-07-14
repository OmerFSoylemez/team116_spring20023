package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double sayi= scanner.nextDouble();

        System.out.println(sayi>0 ? sayi : (-1)*sayi  );



        System.out.println(Math.abs(sayi));
    }
}
