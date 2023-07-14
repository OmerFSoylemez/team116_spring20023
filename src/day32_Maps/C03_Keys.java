package day32_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Keys {

    public static void main(String[] args) {

        // her class da map ile işlem yapabilmek için
        // bir map oluşturmak ve öğrencileri eklemek zorundayız
        // Mapmethod'lar class ında bir map oluşturup,
        // ogrencileri ekleyip bize döndiren bir method oluşturalım

        Map<Integer, String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        // Map deki tum key'leri yazdırın

        System.out.println(ogrenciMap.keySet());//[101, 102, 103, 104, 105, 106]

        // bu seti kaydetmek istersek

        Set<Integer> keySeti = ogrenciMap.keySet();

        /* KeySeti'deki ör+grenci numralarını aşağıdaki formatta yazdırın

            1-101
            2-102
            3-103

         */

        int siraNo = 1;
        for (Integer eachKey:keySeti
             ) {
            System.out.println(siraNo +"-"+eachKey);
            siraNo++;
        }

        // tum öğrencilerin isim ve soyisimlerini bir liste olarak yazdıran
        // bir method oluşturun

        MapMethodlar.tumogrenciListesiYazdır(ogrenciMap);

    }
}
