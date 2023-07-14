package Day16_arrayList;

import java.util.List;
import java.util.Scanner;

public class C15_ForEachLoop {

    public static void main(String[] args) {
        /*
        Stringlerden oluşan liste içindeki kelimelerden a harfi içeren kelimeleri yazdirin
         */

        // daha önceden hazirladiğimız
        List<String> liste = C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aradığınız harfi giriniz");
        String arananHarf = scan.next();

        // ahmet hasan veli

        for (String each: liste
             ) {
            if (each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
