package day05_ifElseStatements;

import java.util.Scanner;

public class C14_ifElseIfStatements {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri ,
        //        Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi giriniz. \n Kadın için: K, Erkek için: E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        if ((cinsiyet != 'K' && cinsiyet !='E')  || yas<10 || yas>80){
            System.out.println("geçersiz giriş");
        } else if (cinsiyet == 'K' && yas>60) {
            System.out.println("Kadın 60 yaşından büyük emekli olabilir");
        } else if (cinsiyet == 'K' && yas<60) {
            System.out.println("Kadın 60 yaşına kadar çalışmalıdır, daha " + (60-yas) + "sene çalışmalısın");
        } else if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Erkek 65 yasından büyük , emekli olabilir");
        } else if (cinsiyet== 'E' && yas<65) {
            System.out.println("Erkek 65 yasına kadar çalışmalıdır,daha "+(65-yas)+"sene çalışmalısın");

        }



    }



}
