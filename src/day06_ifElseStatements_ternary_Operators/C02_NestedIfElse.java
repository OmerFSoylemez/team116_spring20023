package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri ,
        //        Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        // önce yas veya cinsiyetten birini ana değişken saçip
        // ona göre bir if alse oluşturun

        //Cinsiyet ana degisken olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi giriniz. \n Kadın için: K, Erkek için: E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        if (cinsiyet=='K') { //Burada sadece kadinlar var
            //buraya kadınlar için ikinci degiken yaşa göre if else oluşturalım
            if (yas<10 || yas>80){
                System.out.println("geçersiz yaş");
            } else if (yas<60) {
                System.out.println("Kadın 60 yaşına kadar çalışmalıdır, daha " + (60-yas) + "sene çalışmalısın");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet=='E') { //Burada sadece erkekler var
            //buraya erkeler için ikinci degiken yaşa göre if else oluşturalım
            if (yas<10 || yas>80){
                System.out.println("geçersiz yaş");
            } else if (yas<65) {
                System.out.println("Erkek 65 yaşına kadar çalışmalıdır, daha " + (65-yas) + "sene çalışmalısın");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        }else {
            System.out.println("Cinsiyet girişi hatalı");

        }
    }
}
