package day06_ifElseStatements_ternary_Operators;

public class C05_ternaryOperators {
    public static void main(String[] args) {

        int sayi= 14;

        // sayının tek veya çift olduğunu yazdırın

        if (sayi%2 ==0) {
            System.out.println("verilen sayı çift sayıdır");
        }else{
            System.out.println("verilen sayı tek sayıdır");
        }

        //ternary operatorleri basit if else cümlelerini daha kısa yazabilmek için kullanılır.

        System.out.println(sayi % 2 == 0 ? "Verilen sayi çift sayidir" : "verieln sayi tek sayıdır");
    }
}
