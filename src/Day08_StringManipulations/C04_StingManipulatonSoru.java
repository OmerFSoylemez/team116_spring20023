package Day08_StringManipulations;

import java.util.Scanner;

public class C04_StingManipulatonSoru {
    public static void main(String[] args) {
        //  SORU : kullanicidan bir mail alin
        // - mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir mail adresi giriniz");
        String email = scanner.next();

        // eger bütün testlerin ayrı ayrı yapılmasını istiyorsak

//        if (!email.contains("@")){
//            System.out.println("Gecersiz mail");
//        }
//
//        if (!email.contains("@gmail.com")){
//            System.out.println("mail gmail olmali");
//        }
//
//        if (!email.endsWith("@gmail.com")){
//            System.out.println("mailde yazim hatasi var");
//        }

        //eğer testlerin kademeli olarak yapılmasını istiyorsak if, if else kullanılabilir

        if (!(email.contains("@"))) {
            System.out.println("Geçersiz mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");




        }




    }
}
