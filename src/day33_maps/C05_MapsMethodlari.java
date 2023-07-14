package day33_maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Sevda-Fan-12-H-MF");
        ogrenciMap.put(110,"Ayse-Yan-10-M-MF");
        // map e element ekler,
        // eklelen key zaten map de varsa eski value yeni value olarak update eder

        ogrenciMap.replace(102,"Aysegul-Man-11-M-MF");


        ogrenciMap.replace(103,"Ali-Cem-11-K-TM","Kubra-Can-10-K-TM");
        ogrenciMap.replace(104,"Ayse-Can-10-H-MF","Hasan-Cem-11-H-MF");

        //verielen key in value su benim dediğim gibi ise değiştirir
        // dediğim gibi değilse değiştirmiyor

        System.out.println(ogrenciMap.getOrDefault(105, "Bu öğrenci map de yok"));
        System.out.println(ogrenciMap.getOrDefault(120, "Bu öğrenci map de yok"));
        System.out.println(ogrenciMap.get(120));

        // getDefault() : arana key varsa value sunu döndürür
        //                aranan key yoksa tanımladığımız default değerini döndürür
        //                get() den farkı bulamadığında null değeri değil default değerini dönmesidir

        System.out.println(ogrenciMap.containsKey(105));// true
        System.out.println(ogrenciMap.containsValue("Ayse"));// false
        System.out.println(ogrenciMap.containsValue("Aysegul-Man-11-M-MF"));//true

        // containsValue, bir bütün olarak value'ları kontrol eder
        // value içindeki Strin leri kontrol etmez
        // birebir map'teki value'lerle eşleşen varsa true döner

        ogrenciMap.putIfAbsent(120,"Nurhayat-Zan-12-M-MF");
        ogrenciMap.putIfAbsent(102,"Ahmet-Yan-10-M-MF");


    }
}
