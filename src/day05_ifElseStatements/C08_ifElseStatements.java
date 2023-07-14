package day05_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karekter giriniz");

        char karekter = scanner.next().charAt(0);

        if ('A'<= karekter && karekter<='Z') {
            System.out.println("Girilen karakter büyük harf");
        } else {
            System.out.println("Girilen karaketr büyük harf değil");
        }

    }
}
