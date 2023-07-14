package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {


        // Soru 3- Kullanıcıdan ismini, soyismini ve yaşını alıp, aşağıdaki formatta yazdırın.
        //       İsminiz: John
        //       Soyisminiz: DOE
        //       Yaşınız: 44
        //       Kaydiniz basarı ile tamamlanmıştır.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi soy isminizi ve yasinizi giriniz");

        String isim= scanner.nextLine();
        String soyisim= scanner.nextLine().toLowerCase();
        int yas = scanner.nextInt();

        /*
        System.out.println("İsminiz:"+ isim);
        System.out.println("Soyisminiz:"+ soyisim);
        System.out.println("yasiniz"+yas);
        System.out.println("Kaydiniz basari ile tamamlanmistir.");
        */

        System.out.println("Isminiz:"+isim+ "\nSoyisminiz: " +soyisim+" \nYasiniz:"
        +yas+ "\nKaydiniz basari ile tamamlanmıstır.");
    }
}
