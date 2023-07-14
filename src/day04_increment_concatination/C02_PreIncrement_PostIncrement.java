package day04_increment_concatination;

import java.util.Scanner;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        //kullanıcıdan bir tam sayı isteyin
        //Girilen tam sayiyi yazdirip
        //sonra 1 arttirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi girinız");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen Sayı:"+ girilenSayi++      );

        // kullanıcıdan bir sayı daha alın
        // bu sayıyı önce arttırın
        // sonra yazdırın
        System.out.println("Lütfen bir tamasayı daha girin");
        int girilenSayi2 = scanner.nextInt();

        System.out.println("Girilen Sayı 2:"+ ++girilenSayi2      );

        System.out.println("Kodun sonunda GS:"+girilenSayi+", GS2:"+girilenSayi2);

    }
}
