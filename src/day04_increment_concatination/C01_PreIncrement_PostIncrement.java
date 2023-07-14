package day04_increment_concatination;

import java.util.Scanner;

public class C01_PreIncrement_PostIncrement {
    public static void main(String[] args) {


        //kullanıcıdan bir tam sayı isteyin
        //Girilen tam sayiyi yazdirip
        //sonra 1 arttirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi girinız");
        int girilenSayi = scanner.nextInt();

        System.out.println("Girilen sayi:"+ girilenSayi);

        girilenSayi++;

        // kullanıcıdan bir sayı daha alın
        // bu sayıyı önce arttırın
        // sonra yazdırın
        System.out.println("Lütfen bir tamasayı daha girin");
        int girilenSayi2 = scanner.nextInt();

        girilenSayi2++;

        System.out.println("Girilen ikinci sayı"+girilenSayi2);

        System.out.println("Kodun sonunda GS:"+girilenSayi+", GS2:"+girilenSayi2);


    }
}
