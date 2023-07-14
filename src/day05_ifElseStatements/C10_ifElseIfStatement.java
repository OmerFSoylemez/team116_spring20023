package day05_ifElseStatements;

import java.util.Scanner;

public class C10_ifElseIfStatement {
    public static void main(String[] args) {

        /*
        If else-if else-if...birbirine bagımlı durum sayısı
        2 den fazla ise kullanılır
        tüm durumlar birbirine bağımlı olduğundan
        SADECE bir tanesi çalışır diğerleri çalışmaz
         */
        Scanner scanner = new Scanner((System.in));
        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();
        
        if (not<0 || not>100){
            System.out.println("Geçersiz not");
        } else if (not>=85){
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Notunuz DD, kaldınız");
        }

    }
}
