package day34_nestedMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C02_FarklıDataTurleriKullanimi {

    public static void main(String[] args) {

        /*
        Eger Java da farklı data turlerinden değerler eklemek istediğimiz herhangi
        bir yapı (list,Set,Map) nın data turunu object secebiliriz

        Bunun dezavantajı ise elementler obje olarak kaydedildiği için
        herhangi bir elementin kendi data türüne ait(String,Intiger,Bolean) methodları dirtek kullanamayız

        Eger bir elementin data turunu net olarak bilityorsak ve
        o data turune ait methot'u kullanmak istersek
        data Casting yapabiliriz

         */

        List<String> ogrenciList = new ArrayList<>();

        ogrenciList.add("Sevda");
        //ogrenciList.add(12);
        //ogrenciList.add(True);

        System.out.println(ogrenciList);//

        // tüm data türlerinde bilgiyi kabul edecek bir list oluşturmak istesek

        List<Object> hersey = new ArrayList<>();
        hersey.add(12);
        hersey.add(true);
        hersey.add("Selgun");
        hersey.add('Q');


        System.out.println(hersey);//

        // öğrenci listesindeki ilk öğrencinin baş harfini yazdırın

        System.out.println(ogrenciList.get(0).charAt(0));//s

        // hersey deki ilk elementin baş harfini yazdırın

        System.out.println(((String) hersey.get(0)).charAt(0));

        // hersey deki 2. elementin değerinin 2 katını yazdirin

        System.out.println( ((Integer)hersey.get(1) * 2));

        // hersey deki 3. element true ise merhaba false ise hoşçakal yazdırın

        if ((Boolean)hersey.get(2)){
            System.out.println("Merhaba");
        }else {
            System.out.println("Hoşçakal");
        }


    }
}
