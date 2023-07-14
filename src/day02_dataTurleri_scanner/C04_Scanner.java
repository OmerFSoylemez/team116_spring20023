package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan bir tamsayi isteyin
        // girilen sayinin 2 katini yazdirin

        // 1-Scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);

        // 2-Kullanıcıya ne istediğimizi söyleyin

        System.out.println("Lütfen bir tamsayı giriniz");

        // Kullanıcının gireceği data türüne uygun bir variable oluşturun
        // scanner objesi ile variable a uygun hazır metodu kullanıp
        // kullanıcıdan değeri alın ve oluşturduğumuz variable a atayın

        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiğiniz sayinin iki kati: "+ 2*girilenSayi);
    }
}
