package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C01_Tekrar {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        // tum ogrencileri yazdıralım
        MapMethodlar.tumogrenciListesiYazdır(ogrenciMap);

        // numarası verilen bir ogrencinin soyismini update edeleim
        MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,102,"Janjan");

        System.out.println(ogrenciMap);

        // 110 da kucuk olan numaralardaki ogrencileri listeleyelim
        MapMethodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap,1,110);

        // istenen sınıftaki ogrencileri yazdır
        MapMethodlar.istenenSınıftakiOgrencileriYazdir(ogrenciMap,10);




    }
}
