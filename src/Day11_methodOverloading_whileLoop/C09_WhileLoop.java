package Day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        //  kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //  kullanici 0'a basana kadar isleme devam edin
        //  kullanici sifira bastiginda
        //  girdigi pozitif tamsayi adedini ve toplamini yazdirin
        //  kullanici negatif sayi girerse uyari verin ve o sayiyi adet'e eklemeyin


        Scanner scanner = new Scanner(System.in);
        int sayi = 1;
        int sayac = 0;
        int toplam = 0;

     while (sayi!=0){
         System.out.println("Toplamak üzere pozitif tamsayılar giriniz \n Bitirmek için 0 a basın");
        sayi = scanner.nextInt();

        if (sayi>0){
            sayac++;
            toplam += sayi;
        } else if (sayi<0) {
            System.out.println("Pozitif tamsayi girmelisiniz");
        }

        }

        System.out.println("Girdiğiniz " + sayac + " adet pozitif tamsayıların toplamı:"+toplam);
     }



}
