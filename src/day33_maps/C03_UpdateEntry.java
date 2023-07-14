package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C03_UpdateEntry {

    public static void main(String[] args) {

        // ogrenci map inde yilsonu sınıf artirin
        // 12. sınıftakiler için sınıf bilgisi olarak mezun yazın
        // mezun olanlar varsa bir işlem yapılmayacak

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        ogrenciMap= MapMethodlar.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
