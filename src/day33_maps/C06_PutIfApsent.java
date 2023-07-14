package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_PutIfApsent {

    public static void main(String[] args) {
        /*
        Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.

        Input : {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"}
        output : 1 kullanimi : 3 adet
        a kullanimi : 4 adet
        b kullanimi : 2 adet
        c kullanimi : 2 adet
        d kullanimi : 1 adet
        k kullanimi : 1 adet
        s kullanimi : 3 adet
        z kullanimi : 1 adet

        */

        String[] harfler = {"a","b","s","a","s","c","d","b","c","a","a","s","z","k"};

        //1.Yöntem

        Map<String,Integer> harfKullanimMapi = new TreeMap<>();

        // her bir harfi ale alalım
        // harf map de yoksa key = harf, value= 1 olarak ekleyelim
        // harf mad+p de varsa kullanım sayısı olarak tuttuğumuz value u arttıralım

        for (String eachHarf:harfler
             ) {
            if (! harfKullanimMapi.containsKey(eachHarf)){
                harfKullanimMapi.put(eachHarf,1);
            }else {

                int mevcutKullanimsayisi= harfKullanimMapi.get(eachHarf);

                harfKullanimMapi.put(eachHarf,mevcutKullanimsayisi+1);
            }

            System.out.println(harfKullanimMapi);


            //2.Yöntem

            Map<String,Integer>harfKullanimMapi2= new TreeMap<>();

            for (String eachharf:harfler
                 ) {
                 if(harfKullanimMapi2.putIfAbsent(eachharf,1)!= null){

                    int mevcutKullanimsayisi= harfKullanimMapi.get(eachHarf);

                    harfKullanimMapi2.put(eachHarf,mevcutKullanimsayisi+1);

                }
            }

            System.out.println(harfKullanimMapi2);
        }
    }
}
