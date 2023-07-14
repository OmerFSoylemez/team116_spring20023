package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        //Kullanıcıdan ismini isteyip ismi büyük harfe çevirip kaydedin
        //sonra kullanıcıya yeni halini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim= scanner.nextLine();

        //nextLine yazılan bilginin tümünü getirir.
        //next ise ilk space e kadar olan kısmını getirir. H Ibrahim ==> H

        girilenIsim = girilenIsim.toUpperCase();

        System.out.println("Girilen ismin düzenlenmiş hali:"+ girilenIsim);


    }
}
