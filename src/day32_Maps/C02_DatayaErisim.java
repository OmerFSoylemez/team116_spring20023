package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DatayaErisim {

    public static void main(String[] args) {

        // numarası verilen öğrencinin isim ve soyismini
        // ilk harfleri büyük sonraki harfler küçük olacak şekilde yazdırın.

        // map de bir bilgiye erişim birkaç adım ile mümkün olduğundan
        // bu işlemleri method olarak oluşturup
        // ihtiyaç duyulduğunda kullanmak daha KULLANIŞLI olacaktır


        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-MF");
        ogrenciMap.put(103,"Ali-Cem-11-K-MF");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        // map ve ogrenci nuamarsı verdiğimizde istenen fromatta isim ve soyisim  bilgisini
        // bize döndüren bir method oluşturalım

        System.out.println(MapMethodlar.numaraIleOgrenciBulma(ogrenciMap, 103));


    }
}
