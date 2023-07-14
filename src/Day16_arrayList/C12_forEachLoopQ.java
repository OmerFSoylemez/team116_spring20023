package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_forEachLoopQ {

    public static void main(String[] args) {

        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak farkli listeye
        // ekleyip yazdiran bir method hazirlayin

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        tekCiftListesi(arr);
    }

    public static void tekCiftListesi (int[]arr){

        List<Integer> ciftlerListesi = new ArrayList<>();
        List<Integer> teklerListesi = new ArrayList<>();

        // for each loop ile elemanlara ulaş

        for (int each: arr
             ) {

        // gelen eleman tek mi çift mi

        if (each % 2==0){
            ciftlerListesi.add(each);
        }else {
            teklerListesi.add(each);

        }
        }

        System.out.println("Çift Sayilar Listesi:"+ ciftlerListesi);
        System.out.println("Tek Sayilar Listesi:"+teklerListesi);
    }
}
