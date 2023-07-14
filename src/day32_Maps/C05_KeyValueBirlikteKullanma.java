package day32_Maps;

import java.util.Map;

public class C05_KeyValueBirlikteKullanma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        // ogrenci numarası verilen iki değer arasında olan (sınır değerleri dahil)
        // tum öğrencilerin numara,isim,soyisim ve bölümlerinş yazdırın

        int basNo = 102;
        int bitNo = 104;

        MapMethodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap,basNo,bitNo);


    }

}
