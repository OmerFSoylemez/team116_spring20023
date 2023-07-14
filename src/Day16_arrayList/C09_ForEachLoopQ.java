package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ForEachLoopQ {

    public static void main(String[] args) {
        
        // Soru3- Verilen string bir array deki her bir elementi kontrol edip,
        // kelimenin uzunluğu çift sayi ise ilk yarısını
        // kelimenin uzunluğu tek sayi ise ortadaki harf dahil ikinci yarısını
        // yeni bir listeye ekleyip yazdırın
        
        String[] arr= {"araba", "kelam", "mehmet", "hasan", "kitaplık"};

        isimManipülasyonMethodu(arr);
    }
    public static void isimManipülasyonMethodu(String[] arr){
        
        //Manipüle edilen kelimeleri eklemek için
        List<String>manipuleKelimeler = new ArrayList<>();
        
        //arr içindeki bütün kelimeler tek tek ulaşmak
        for (String each : arr
        ){
            //mehmet// kelimenin uzunluğu çift ise

            if (each.length()%2==0){

            // ilk yarisi için index 0 dan uzunluğun yarısı kadar.

            manipuleKelimeler.add(each.substring(0,each.length()/2));

            }else {
                manipuleKelimeler.add(each.substring((each.length()-1/2)));
            }
            
        }
        System.out.println(manipuleKelimeler);
    }
    
    
}
