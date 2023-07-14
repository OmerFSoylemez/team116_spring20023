package day03_DataCasting_wrapperClasses;

public class C06_İslemOnceligi {

    public static void main(String[] args) {

        System.out.println(8*5+2*(12/4)-19);//27

        System.out.println(35/5);//7

        System.out.println(20/8);//2

        //bölünen iki sayıda int olursa sonucu int olarak yazdırır.

        double dbl =20;
        System.out.println(dbl/8);//2.5

        int sayi1 = 20;
        int sayi2 = 8;

        //sayı1 / sayı2 yi ondalıklı sayı olarak yazdırın.

        System.out.println(       (double)sayi1/sayi2      );//2.5
    }
}
