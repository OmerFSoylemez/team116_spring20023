package Day12_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        /* Do while loop kontrol etmeden once
        1 kere loop u çalıştırır.

        while Loop'da loop body'sinin hiç çalışmama ihtimali VARDIR
        do-while loop da loop body sinin hiç çalışmama ihtimali YOKTUR
        loop body si en az bir kere çalışır.
         */

        // kullanıcıdan sayı değerleri alıp toplayalım
        // kullanıcı 0 a bastığında işlem bitsin
        // ve toplamı yazdırsın

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        do {
            System.out.println("Lütfen toplamak için bir sayı yazın\n Bitirmek için 0'a basın");
            sayi = scanner.nextInt();
            toplam+=sayi;
        }while (sayi != 0);
    }
}
