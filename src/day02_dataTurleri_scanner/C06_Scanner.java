package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan bir double, bir de int sayı alıp
        //         bunların toplamını ve çarpımını yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ondalıklı bir sayı giriniz");
        double ondalikliSayi=scanner.nextDouble();

        System.out.println("Lütfen bir tamsayi giriniz");
        int tamSayi= scanner.nextInt();

        System.out.println("girilen sayilarin toplamı: "+(ondalikliSayi+tamSayi));
        System.out.println("Girilen sayilarin carpımı: "+(ondalikliSayi*tamSayi));
    }
}
