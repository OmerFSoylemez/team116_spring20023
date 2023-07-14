package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C01_SifreKontrolu {
    public static void main(String[] args) {

        /*
        Kullanıdıdan bir şifre isteyin
        Sifre asağıdaki 4 şartı sağlıyorsa "Mükemmel Sayı" yazdırın

        Sağlanmayan şartların tamamı kullanıcıya söyleyin

        1- Sayı 4 basamaklı olmalıdır.
        2- Sayı 3 ile bölünebilmelidir.
        3- Sayı 5 ile bölünememelidir.
        4- Sayının birler basamağı tek olmalıdır.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi = scanner.nextInt();

        boolean sayiMükemmelMi = true;

        //1- Sayı 4 basamaklı olmalıdır.
        if (sayi<1000 || sayi>9999){
            System.out.println("Sayı 4 basamaklı olmalıdır");
            sayiMükemmelMi=false;
        }

        //2- Sayı 3 ile bölünebilmelidir.
        if (sayi %3!=0) {
            System.out.println("Sayı 3 ile bölünebilmelidir.");
            sayiMükemmelMi=false;
        }

        //3- Sayı 5 ile bölünememelidir.
        if (sayi %5 == 0) {
            System.out.println("Sayı 5 ile bölünememelidir.");
            sayiMükemmelMi=false;
        }

        //4- Sayının birler basamağı tek olmalıdır.
        if ((sayi%10)%2==0) {
            System.out.println("Sayının birler basamağı tek olmalıdır.");
            sayiMükemmelMi=false;
        }

        if (sayiMükemmelMi) {
            System.out.println("Mükemmel Sayi");
        }

    }
}
