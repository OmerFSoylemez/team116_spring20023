package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {

    public static void main(String[] args) {
        
    Map<String,Integer> harfKullanimSayilari = new TreeMap<>();
    
    harfKullanimSayilari.put("A",20);
    harfKullanimSayilari.put("K",10);
    harfKullanimSayilari.put("C",25);
    harfKullanimSayilari.put("M",23);
    harfKullanimSayilari.put("Z",32);

        System.out.println(harfKullanimSayilari);
        
        // A'nın değerini iki katına çıkarın
        
        int eskiDeger = harfKullanimSayilari.get("A"); // 20
        harfKullanimSayilari.put("A",2*eskiDeger);
        
        System.out.println(harfKullanimSayilari);//40

        // B varsa değerini 3 arttırın

        if(harfKullanimSayilari.containsKey("B")){
            eskiDeger= harfKullanimSayilari.get("B");
            harfKullanimSayilari.put("B",eskiDeger+3);
        }

        System.out.println(harfKullanimSayilari);

        /*
            java var olan veya olmayan key lerin
            alue leri üzerinde işlem yapmak için
            ozel iki method geliştirmiş

            bu method'lar functional programing (Lambda) kullanarak çalışır
         */

        // A'nın değerini iki katına çıkarın

        harfKullanimSayilari.compute("A",(k,v)->2*v);
        System.out.println(harfKullanimSayilari);

        // B varsa değerini 3 arttırın

        harfKullanimSayilari.computeIfPresent("B",(k,v)->v+3);//
        harfKullanimSayilari.computeIfPresent("M",(k,v)->v+3);//
        System.out.println(harfKullanimSayilari);


        //Eger B yoksa degeri 5 olarak ekleyin

        harfKullanimSayilari.putIfAbsent("B",5);
        harfKullanimSayilari.putIfAbsent("A",5);

        System.out.println(harfKullanimSayilari);

        // Eger D yoksa degeri 5 olarak ekleyin

        harfKullanimSayilari.computeIfAbsent("D",v ->5);
        harfKullanimSayilari.computeIfAbsent("C",v ->5);

        System.out.println(harfKullanimSayilari);

} 
}
