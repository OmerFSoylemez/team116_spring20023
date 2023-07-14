package Day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //  ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //  eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre = scanner.nextLine();

        // tüm hataları raporlamam istendiği için bağımsız if cümlesi kullanmalıyız.
        // tüm şartları sagladığını kontrol etmek için sayaç kullanalım

        int sayac = 0;

        //  - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);
        if(!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("İlk harf küçük harf olmalı");
            sayac++;
        }
        //  - son karakter rakam olmali

        char sonHarf= sifre.charAt(sifre.length()-1);

        if (!(sonHarf>='0'&& sonHarf<='9')){
            System.out.println("Son karekter sayi olmalı");
            sayac++;
        }

        //  - sifre bosluk icermemeli

        if(sifre.contains(" ")){
            System.out.println("Sifre boşluk içermemeli");
            sayac++;
        }
        //  - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunluğu en az 10 karakter olmalı");
            sayac++;
        }
        if(sayac==0){
            System.out.println("Sifreniz başarı ile kaydedilmiştir");
        }

    }
}
