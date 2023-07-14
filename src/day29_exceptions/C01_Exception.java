package day29_exceptions;

import java.util.Scanner;

public class C01_Exception {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayı alıp
        //ilk sayıyı ikinciye bolun
        //ve sonucu yazdırın

        /*
            kodlari yazarken
            kullanıcı tarafından yapılacak hataları ONGEREBİLİYORSAK
            Java'ya öngörebildiğimiz hata ihtimallleri için
            yapması gerekenleri söyleyebiliriz

            orneğin aşagıdaki bölme işleminde
            kullanıscının sıfır girme ihtimalini
            if else ile handle edebiliriz

            Ancak tüm sorunları if else ile çözmek mümkün değildir
            orneğin istenen data türüne uygun olmayan bir imput girilmesini
            if-else ile çözeceğiz

            Java ÖNGÖRÜLEBİLİR hataları çözebilmemiz için
            exception interface'ini oluşturmuştur.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bölünecek tamsayıyı yazın");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen bölecek sayıyı yazın");
        int sayi2 = scanner.nextInt();

        if (sayi2 == 0) {
        System.out.println("Sayılar sıfıra bölünemez");
         }else  {
            System.out.println("İki sayının bölme sonucu: "+ sayi1/sayi2);
        }

    }
}
