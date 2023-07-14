package Day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {

    public static void main(String[] args) {


        //kullanıcıdan bir sayı alıp 3 ile bölünüp bölünemediğini yazdırın
        //kullanıcı 3 ile bölünebilen bir sayı girinceye kadar
        //tekrar değer isteyin

        /*
              Tekrar sayısı tam olarak bilinmeyen
              tekrar sayısı farklı bir şarta bağlı olan durumlarda while loop kullanırız
         */

        Scanner scanner = new Scanner(System.in);




        //girilen sayı 3'e bölünene kadar tekrar et
        //while loop'da () içine yazılan sart sağlanmadığı müddetçe
        //kod tekrar çalışır.

        int sayi=2;

        while (sayi %3 != 0) {
            System.out.println("Lutfen pozitif bir tamsayi girin");
            sayi = scanner.nextInt();
            if (sayi % 3 == 0) {
                System.out.println("sayi 3 ile tam bolunuyor");
            } else {
                System.out.println("sayi 3 ile tam bolunemiyor");
            }

        }

    }

}
