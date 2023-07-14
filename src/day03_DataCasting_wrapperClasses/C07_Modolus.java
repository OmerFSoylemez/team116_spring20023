package day03_DataCasting_wrapperClasses;

import java.util.Scanner;

public class C07_Modolus {
    public static void main(String[] args) {

        System.out.println((20 / 8));//4

        System.out.println(4552556 %3);//eger sonuç 0 ise sayı 3 e tam bölünür

        // 12563412 sayısı 17 nin tam katımıdır?

        System.out.println((12563412 % 17));// 4

        //kullanıcıdan pozitif tam sayı alıp birler basamağının karesini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi%10 *girilenSayi%10);

        //girilen sayıdan birler basamağını silip kalan sayıyı yazdırın
        // örneğin 213 girildiğinde 21 yazdırsın

        System.out.println(girilenSayi/10);//213/10==> 21


    }
}
