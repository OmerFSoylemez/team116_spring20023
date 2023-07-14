package Day11_methodOverloading_whileLoop;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //        Girilen sayinin pozitif tam bolenleri sayisini bulup
        //        bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifBolenSayiyiBul(sayi));

        //verilen sayının asal olup olmadğını bu metod u kullanarak yazdıralım

        int ptbs = pozitifBolenSayiyiBul(sayi);
        if(ptbs==2){
            System.out.println("verilen sayi asal");
        }else {
            System.out.println("verilen sayi asal değil");
        }
    }

    public static int pozitifBolenSayiyiBul(int sayi){
        int sayac=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi %i == 0){
                sayac++;
            }
        }
        return sayac;
    }
}