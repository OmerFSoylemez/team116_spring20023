package day05_ifElseStatements;

import java.util.Scanner;

public class C09_ifElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter girin");


        char karakter = scanner.next().charAt(0);

        if ('a'<= karakter && karakter <= 'z'){
            System.out.println("Girilen küçük harfin yeni hali:" + Character.toUpperCase(karakter));
        }else {
            System.out.println("Girilen karakter :" + karakter);
        }


    }
}
