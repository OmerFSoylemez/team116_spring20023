package day32_Maps;

import java.util.Map;

public class C06_Update {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        // numarası verilen öğrencinin soyismini, yeni verilen deger ile update edin

        /*
        101= Ali-Can-11-H-MF
        102=Veli-Cem-10-K-MF
        103=Ali-Cem-11-K-MF
        104=Ayse-Can-10-H-MF
        105=Sevgi-Cem-11-M-TM
        106=Sevgi-Can-10-K-MF
         */

        //ornek olarak 102 numaralı ogrencinin soyisimini Han yapalım

        ogrenciMap = MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,102,"Han");

    }
}
