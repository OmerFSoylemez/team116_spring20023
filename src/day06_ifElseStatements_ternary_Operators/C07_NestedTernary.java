package day06_ifElseStatements_ternary_Operators;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi= scanner.nextInt();

        System.out.println(  sayi>0
                                    ?
                                    sayi%2==0 ? "Çift sayi" : "Çift sayı değil"
                                    :
                                    sayi>=-999 && sayi<=-100 ? "Uç basamaklı" : "Uç basamaklı değil"
                                    );



    }
}
