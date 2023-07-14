package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C02_EntrySet {

        /*
        su ana kadar bir map verildiğinde
        key lere ogrenciMap.keyset() ile,
        value lere ogrenciMap.values() ile ulaşabiliyoruz

        eger hem key hem de value ile işlem yapmamız gerekirse
        mecburen key lerin bulunduğu Set
        ve value ların bulunduğu Collection
        objelerini beraber yönetmemiz gerekir

        Java key ve value lara birkikte barındırması için
        Entry isimli bir class oluşturmuştur

        Entry ile key ve value yu birlikte kullanabilir,
        entry üzerinde yapilan update'leri otomatik olarak map'e işleyebiliriz

         */


    public static void main(String[] args) {
        //ogrenci listesini numara-isim-soyisim-sınıf şeklinde yazdıralım

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        MapMethodlar.numaralıTumOgrenciListesiYazdir(ogrenciMap);
    }
}
