package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayı alıp
        //ilk sayıyı ikinciye bolun
        //ve sonucu yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bölünecek tamsayıyı yazın");
        int sayi1 = 0;
        try {
            sayi1 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("tamsayı değeri girmelisiniz");
        }

        System.out.println("Lütfen bölecek sayıyı yazın");
        int sayi2 = 0;
        try {
            sayi2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("tamsayı değeri girmelisiniz");
        }

        /*
            Kodumuzu yazarken
            bir exception oluşma ihtimali görüyorsak
            sorun çıkması muhtemel kodumuzu
            try-catch ile çevreleriz

            try-catch temel 3 bolumden oluşur
            1-try blogu : exception oluşması muhtemel kodların konulduğu bölüm
            2-catch(Exception e): catch keyword ve beklenen exception turunu yazdığım bölüm
            3-catch blogu : ongördüğümüz exception oluştuğunda
                            çalışmasını istediğimiz kodlar

            Kullanıcının yapması muhtemel hataları
            tamamıyla ayıklamak için
            geniş kapsamlı düşünüp
            tüm ihtimalleri çözmek gerekir.


         */


        try {
            System.out.println("İki sayının bölme sonucu: "+ sayi1/sayi2);
        } catch (Exception e) {

            System.out.println("Sayılar sıfıra bölünemez");
        }




    }
}


