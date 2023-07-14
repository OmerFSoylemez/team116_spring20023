package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri ,
        //        Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        // önce yas veya cinsiyetten birini ana değişken saçip
        // ona göre bir if else oluşturun

        //Yas ana degisken olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi giriniz. \n Kadın için: K, Erkek için: E");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");

        int yas = scanner.nextInt();

        if (yas<10 || yas>80){//1.Bölge
            System.out.println("Geçersiz yaş girişi");

        } else if (yas<60) {// 2.Bölge
            if (cinsiyet!= 'E' && cinsiyet!= 'K'){
                System.out.println("Cinsiyet girişi hatalı");
            } else if (cinsiyet =='K') {
                System.out.println("Kadın 60 yaşına kadar çalışmalıdır, daha " + (60-yas) + "sene çalışmalısın");
            } else {
                System.out.println("Erkek 65 yaşına kadar çalışmalıdır, daha " + (65-yas) + "sene çalışmalısın");
            }

        } else if (yas<65) { // 3.Bölge
            if (cinsiyet!= 'E' && cinsiyet!= 'K'){
                System.out.println("Cinsiyet girişi hatalı");
            } else if (cinsiyet =='K') {
                System.out.println("Kadın emekli olabilir");
            } else {
                System.out.println("Erkek 65 yaşına kadar çalışmalıdır, daha " + (65-yas) + "sene çalışmalısın");
            }


        }else { //4.Bölge
            if (cinsiyet!= 'E' && cinsiyet!= 'K') {
                System.out.println("Cinsiyet girişi hatalı");

            }else {
                System.out.println("Emekli olabilirsin");
            }


    }
    }
}
