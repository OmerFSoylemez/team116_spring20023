package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatch {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayı alıp
        //Kullanıcı tamsayı girmezse, hata mesajı verip yeniden sayi isteyin
        //ilk sayıyı ikinciye bolun
        //ve sonucun tamsayı kısmını yazdırın

        Scanner scanner = new Scanner(System.in);

        boolean sayiIste= true;
        int sayi1=0;

        while (sayiIste){

            try {
                //scanner = new Scanner(System.in);
                System.out.println("Lütfen bölünecek tamsayıyı yazın");
                sayi1 = scanner.nextInt();
                sayiIste = false;

            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("tamsayı değeri girmelisiniz");
            }
        }

        sayiIste= true;
        int sayi2=0;

        while (sayiIste){

            try {
                scanner = new Scanner(System.in);
                System.out.println("Lütfen bölünecek tamsayıyı yazın");
                sayi2 = scanner.nextInt();
                sayiIste = false;

            } catch (InputMismatchException e) {
                String temp = scanner.next();
                System.out.println("tamsayı değeri girmelisiniz");
            }
        }
        try {
            System.out.println("İki sayının bölme sonucu: "+ sayi1/sayi2);
        } catch (Exception e) {

            System.out.println("Sayılar sıfıra bölünemez");
        }



    }
}
