package day06_ifElseStatements_ternary_Operators;

import java.awt.*;
import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20,
        //                      yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                      yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Girdiginiz ürün adedini yazınız");
        int urunAdedi = scanner.nextInt();

        System.out.println("Ürünün liste fiyatını giriniz");
        double listeFiyatı = scanner.nextDouble();

        System.out.println("Müsteri kartınız var ? E: Evet, H:Hayır");
        char kartVarMı = scanner.next().toUpperCase().charAt(0);

        double toplamFiyat= 0;

        if (kartVarMı=='E') {//kartı olanlar

            if(urunAdedi>10) {
                toplamFiyat = urunAdedi * listeFiyatı * 80 / 100;
                System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat);
            }else {
                toplamFiyat = urunAdedi * listeFiyatı * 85 / 100;
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
            }

        } else if (kartVarMı=='H') {//kartı olmayanlar

            if(urunAdedi>10) {
                toplamFiyat = urunAdedi * listeFiyatı * 85 / 100;
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
            }else {
                toplamFiyat = urunAdedi * listeFiyatı * 90 / 100;
                System.out.println("%10 indirimli toplam fiyat:" + toplamFiyat);
            }

        }else {//yanlış kart girişi
            System.out.println("Kart bilgisi için yanlış giriş yaptınız");

        }

    }
}
