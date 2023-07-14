package day22_stringBuilder_acceessModifier;

public class C03_StringBuilderVeStringMethodları {

    public static void main(String[] args) {

        /*
        StringBuilder bazı methodlar string döndürür.
        bu methodlar string döndürdüğü için
        String deki immutablity' ye uyarlar
        ve stringbuilder' ı değiştirmezler

        Bazende stringbuilder da olmayan
        ancak string de olna metodları kullanmak isteyebiliriz
        bu durumda önce stringbuilder ı string e dönüştürmek gerekir

        Eger string metodları kullanarak bir stringbuilder ı
        kalıcı olarak değiştirmek istersek
        -önce toString yapıp String e çeviririz.
        -String olan bu halinde String metodları manipulation yaparız
        -String olan yeni değeri Eski StyringBuilder a atama yaparız
         sb= new StringBuilder(değiştirilmişStringHali)
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.substring(5));//Candir

        System.out.println(sb1);//Java Candir

        sb1.substring(5,8);

        System.out.println(sb1);//Java Candir

        System.out.println(sb1.toString().toUpperCase());

        System.out.println(sb1);//Java Candir

        // bunu yeni stringbuilder a atayabilir miyiz?

        //sb1 = sb1.toString().toUpperCase();

        sb1 = new StringBuilder(sb1.toString().toUpperCase());

        System.out.println(sb1);//JAVA CANDİR

    }
}
