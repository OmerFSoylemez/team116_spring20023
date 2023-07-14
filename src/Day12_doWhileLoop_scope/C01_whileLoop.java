package Day12_doWhileLoop_scope;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {
        /*
        While Loop da kullanacağımız variable'lara baştan değer atamamız gerekir
        eger bu variable lara yanlış değer ataması yaparsak
        while loop body i hiç çalışmayabilir

        java bu dezavantajı kaldırmak için
        do while loop oluşturmuştur.

        do while loop un temel amacı ilk kontrolü yapmadan
        kodu bir kez çalıştırır sonra kontrol yapar.
         */

    // kullanıcıdan sayı değerleri alıp toplayalım
    // kullanıcı 0 a bastığında işlem bitsin
    // ve toplamı yazdırsın


        Scanner scanner = new Scanner(System.in);
        double toplam= 0;
        double sayi=0;

        System.out.println("Toplamak üzere bir sayı giriniz");
        sayi = scanner.nextDouble();
        toplam+= sayi;

        while (sayi !=0) {
            System.out.println("Toplamak üzere bir sayı giriniz");
            sayi = scanner.nextDouble();
            toplam += sayi;

        }

        System.out.println("Girilen sayıların toplamı : "+ toplam);
}
}
    
