package Day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        //Kullanıcıdan toplanmak üzere sayılar alın
        //toplam 500 olur veya geçerse değer almayı durdurup
        //kaç kişi girildiğini ve toplamın kaç olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        int sayi=0;

        while(toplam<500) {

            System.out.println("toplanmak için tamasayı giriniz");
            sayi = scanner.nextInt();

            sayac++;
            toplam+= sayi;
        }

        System.out.println(sayac +" adet sayının toplamı:"+ toplam);



    }
}
