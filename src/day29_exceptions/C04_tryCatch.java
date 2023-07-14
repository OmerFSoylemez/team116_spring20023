package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {
    public static void main(String[] args) {



    // Kullanicidan toplanmak uzere sayi alin
    // kullanici tamsayi girmezse hata mesaji verip yeniden tamsayi isteyin
    // kullanici islemi bitirmek icin Q veya q'ya basacaktir
    // kullanici islemi bitirdiginde
    // kac tane gecerli sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        int sayi=0;
        int toplam=0;
        int sayac = 0;
        boolean sayiIste= true;
        String tercih ="0";

        Scanner scanner = new Scanner(System.in);

        while (sayiIste){
            System.out.println("Toplanmak üzere tamsayı giriniz");

            try {//normal giriş için çalışacak kodlar
                sayi = scanner.nextInt();
                toplam+=sayi;
                sayac++;

            } catch (InputMismatchException e) {//exception durumunda çalışacak kodlar
                tercih= scanner.next();
                //kullanıcı yanlış giriş yaptığında veya Q ya bastığında burası çalışacak
                if (tercih.equalsIgnoreCase("q")) {
                    break;
                }else {
                    System.out.println("Toplanmak için TAMSAYI yazmalısınız");
                }

            }

        }
        System.out.println("Toplam"+ sayac+"adet sayi girdiniz.Toplamları :"+toplam);

}
}
