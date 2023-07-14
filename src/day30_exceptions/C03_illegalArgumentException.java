package day30_exceptions;

import java.util.Scanner;

public class C03_illegalArgumentException {

    public static void main(String[] args) {

        // kullanıcıdan yasını alıp
        // 65 den büyükse emekli olabileceğini yazdırın
        // eger kulllanıcı 20'den kücük bir yas girerse
        // exception fırlatın ve emeklilik işlemleri olan kodları atlayın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        try {
            if (yas<20){

                throw new IllegalArgumentException("Yas 20'den küçük olamaz");

            }else if (yas<65){
                System.out.println("Emekli olmanıza" + (65-yas) + "sene var");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }

        /*
        buradada 30 satır emeklilik ile ilgili işlemler olsun
         */

            System.out.println("emeklilik işlemleri1");
            System.out.println("emeklilik işlemleri2");
            System.out.println("emeklilik işlemleri3");
            System.out.println("emeklilik işlemleri4");


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }
}
