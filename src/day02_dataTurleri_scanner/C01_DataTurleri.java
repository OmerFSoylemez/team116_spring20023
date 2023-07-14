package day02_dataTurleri_scanner;

import javax.print.DocFlavor;

public class C01_DataTurleri {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        // boolean b3 = "Hello world";
        // boolean b4 = 5;

        // char c1 = true;
        // char c2 ="H";
        char c3 = 'v';
        char c4 = ' ';
        // char c5 = 'm ';

        String str1 = "v";
        String str2 = "5";

        int sayi1 = 5; // 32 bit hafıza
        short sayi2 = 5; // 16 bit hafıza
        byte sayi3 = 5; // 8 bit hafıza
        long sayı4 = 5; // 64 bit hafıza


        float ond1 = 2.345352633636f;
        double ond2 = 3.3356354364747484;

        System.out.println(ond1); //float virgülden sonra 6 hane gösterir
        System.out.println(ond2);// 3.335...... double virgülden sonra 16 hane gösterir

        double d1 =20;
        double d2 =5;

        System.out.println(d1/d2);// 4.0==>3.999999999999 veya 4.00000000000001 yazabilir



    }
}
