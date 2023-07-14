package day32_Maps;

import java.util.Map;

public class C04_Values {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        /*
        {
        101=Ali-Can-11-H-MF,
        102=Veli-Cem-10-K-MF,
        103=Ali-Cem-11-K-MF,
        104=Ayse-Can-10-H-MF,
        105=Sevgi-Cem-11-M-TM,
        106=Sevgi-Can-10-K-MF
        }
         */


        // tum ogrencilerin sadece value larını yazdırın
        System.out.println(ogrenciMap.values());
        /*
            [
            Ali-Can-11-H-MF,
            Veli-Cem-10-K-MF,
            Ali-Cem-11-K-MF,
            Ayse-Can-10-H-MF,
            Sevgi-Cem-11-M-TM,
            Sevgi-Can-10-K-MF
            ]
         */

        // istenen sınıftaki tum ogrencilerin isim ve soyisimlerini yazdirin

        MapMethodlar.istenenSınıftakiOgrencileriYazdir(ogrenciMap,10);


        //  ÖDEV
        // Verilen soyisme sahip tüm öğrencieri yazdırın
        // Verieln şube'deki tum öğrencileri yazdırın
        // Verielen sınıf ve şubedeki tüm öğrencileri yazdırın


    }
}
