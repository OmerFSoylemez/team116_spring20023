package day34_nestedMaps;

import java.util.TreeMap;

public class C04_TreeMap {

    public static void main(String[] args) {

        /*
            TreeMap elementleri doğal sıralı olarak tuttuğu
            ve yeni eklelen elementleri de bu sıralamaya uygun konuma yerleştirdiği için
            diger map lede olamayan bazı ekstra özelliklere sahiptir
         */

        TreeMap<Integer,String>ogrenciMap = new TreeMap<>();
        ogrenciMap.put(103,"Ali Can");
        ogrenciMap.put(120,"Veli Cem");
        ogrenciMap.put(101,"Akif Han");
        ogrenciMap.put(140,"Yusuf San");

        System.out.println(ogrenciMap); // {101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.subMap(103, 110)); //{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103, 120)); //{103=Ali Can}
        System.out.println(ogrenciMap.subMap(103,false, 120,true)); //{120=Veli Cem}

        // sadece sınırlar yazılırsa başlangıc dahi birtiş hariç olur
        // istersek başlangıç ve bitişin dahil olup olmamasının boolean değerler ile belirleyebiliriz

        System.out.println(ogrenciMap.descendingMap());//{140=Yusuf San, 120=Veli Cem, 103=Ali Can, 101=Akif Han}
        System.out.println(ogrenciMap);//{101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.descendingKeySet());//[140, 120, 103, 101]

        // kullanıldığı satırda treeMap in sıralamasını tersine çeviriri
        // ama bu kalıcı olmaz , sadece o satıra ait bir işlemdir

        System.out.println(ogrenciMap.lowerKey(120)); //103

        System.out.println(ogrenciMap.lowerEntry(120));//103= Ali Can

        System.out.println(ogrenciMap.floorKey(103));// asağı yuvarla 103
        System.out.println(ogrenciMap.floorKey(105));// asağı yuvarla 103
        System.out.println(ogrenciMap.floorKey(119));// asağı yuvarla 103
        System.out.println(ogrenciMap.floorKey(120));// asağı yuvarla 120

        System.out.println(ogrenciMap.firstEntry());// 120 = Veli Cem

        System.out.println(ogrenciMap.higherKey(120)); // büyük olan 140
        System.out.println(ogrenciMap.higherEntry(100));// 101 =Akif han

        System.out.println(ogrenciMap.ceilingKey(120));// yukarı yuvarlar 120
        System.out.println(ogrenciMap.ceilingKey(100));// yukarı yuvarlar 101=Akif Han


        System.out.println(ogrenciMap);//{101=Akif Han, 103=Ali Can, 120=Veli Cem, 140=Yusuf San}

        System.out.println(ogrenciMap.headMap(120));// basa dogru map
        //{101=Akif Han, 103=Ali Can} bitisler dahil olmaz

        System.out.println(ogrenciMap.headMap(130));// {101=Akif Han, 103=Ali Can, 120=Veli Cem}

        System.out.println(ogrenciMap.headMap(120, true));
        //{101=Akif Han, 103=Ali Can, 120=Veli Cem} bitis olarak verilen key'i dahil eder


        System.out.println(ogrenciMap.headMap(130, true));
        //{101=Akif Han, 103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.tailMap(120));// sona dogru map
        //{120=Veli Cem, 140=Yusuf San} 120 baslangıc değeri olduğundan inclusive
        System.out.println(ogrenciMap.tailMap(120,false));
        //{140=Yusuf San} false yazdığımız için exclusive

        System.out.println(ogrenciMap.firstKey());//101
        System.out.println(ogrenciMap.firstEntry());//101=Akif Han
        System.out.println(ogrenciMap.lastKey());//140
        System.out.println(ogrenciMap.lastEntry());//140=Yusuf San

        System.out.println(ogrenciMap.pollLastEntry());// 140= Yusuf San
        System.out.println(ogrenciMap);//{101=Akif Han, 103=Ali Can, 120=Veli Cem}
        System.out.println(ogrenciMap.pollFirstEntry());// 101= Akif Han
        System.out.println(ogrenciMap);//{103=Ali Can, 120=Veli Cem}

        ogrenciMap.clear();
        System.out.println(ogrenciMap);//{}


    }
}
