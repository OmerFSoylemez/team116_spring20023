package day32_Maps;

import java.util.*;

public class C01_MapOlusturma {

    public static void main(String[] args) {

        //variable oluşturma
        int sayi = 5;
        String str = "Java Candir";

        // çoklu element barındıran collections oluşturma

        List<String> liste = new ArrayList<>();
        Set <Integer>sayiSeti = new HashSet<>();
        liste.add("4");
        sayiSeti.add (34);

        // Map her zaman key-value ikilisi barındırır
        // bu özelliği sebebiyle map oluştutururken
        // key ve value nun data türleri yazılmalıdır

        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        System.out.println(ogrenciMap);
        //Map'i yazdırdığınızda key=value şekilinde yazar
        // = atama işareti değildir,yazdırırken bilgi vermek için böyle yazılır
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}


        System.out.println(ogrenciMap.get(101));//Ali-Can-11-H-MF

        // 103 numaralı öğrencinin şubesini yazdırın
        // map de tüm bilgiler String olarak birleştirilen Value içerisindedir
        // String deki bir bilgiye direk ulaşamayız
        // manipulation yapıp istediğimiz bilgiye ulaşmalıyız

        //1- once istenen öğrencinin value sunu bulup kaydedelim

        String value103 = ogrenciMap.get(103);//Ali-Cem-11-K-TM

        //2- value özel bir işalretle birleştirilen farklı bilgilerden oluşur
        // split("-") ile bu bilgileri bir array e dönüştürüp kaydedelim
        String[] valueArr = value103.split("-"); //[Ali, Cem, 11, K, TM]

        // 3-artik istediğim bilgiye tanımlı index ile ulaşabilirim

        System.out.println(valueArr[3]);//K




    }


}