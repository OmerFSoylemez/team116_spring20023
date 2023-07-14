package day32_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodlar {


    // bu class'da static mathodlar oluşturalım ki
    // heryerden class ismiyle kullanabilelim

    // map ve ogrenci nuamarsı verdiğimizde istenen fromatta isim ve soyisim  bilgisini
    // bize döndüren bir method oluşturalım


    public static String numaraIleOgrenciBulma(Map<Integer,String>ogrenciMap,int ogrenciNo) {

        // 1- istenen numaraya ait value'u kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo); //Ali-Cem-11-K-TM

        // 2- tek bir String olan value'yu bilgileri labilmek için Sprit edelim
        String[] valueArr = ogrenciValue.split("-");

        // 3- istenen bilgileri alıp istenen formatta kaydedelim
        String isim = valueArr[0];
        String soyisim = valueArr[1];
        String formataUygunIsimSoyisim = isim.substring(0,1).toUpperCase() +
                                         isim.substring(1).toLowerCase() +
                                         " "+
                                         soyisim.substring(0,1).toUpperCase() +
                                         soyisim.substring(1).toLowerCase();

        return formataUygunIsimSoyisim;



    }

        public static Map<Integer,String> ogrenciMapOlustur(){

            Map<Integer,String> ogrenciMap = new HashMap<>();
            ogrenciMap.put(101,"Ali-Can-11-H-MF");
            ogrenciMap.put(102,"Veli-Cem-10-K-MF");
            ogrenciMap.put(103,"Ali-Cem-11-K-MF");
            ogrenciMap.put(104,"Ayse-Can-10-H-MF");
            ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
            ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

            return ogrenciMap;


        }

        public static void tumogrenciListesiYazdır(Map<Integer,String>ogrenciMap){

            // tum öğrencilerin isim ve soyisimlerini bir liste olarak yazdıran
            // bir method oluşturun
            // tum ogrencilere ulaşabilmek için tüm öğrencilerin key'lerine ihtiyaç var

            Set<Integer> OgrencikeySeti = ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106]

            // tum Key'leri tek tek ele alıp
            // o key a ait isim ve soyisimi yukarıdaki methodu kulalanarak  yazdıralım

            int siraNo=1;
            for (Integer eachkey: ogrenciMap.keySet()
                 ) {

                //herbir öğrenciye ait isim ve soyismi yazdıralım
                System.out.println(siraNo + " - " +numaraIleOgrenciBulma(ogrenciMap, eachkey));
                siraNo++;
            }
            



            }

    public static void istenenSınıftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sınıf) {

        // istenen sınıftaki tum ogrencilerin isim ve soyisimlerini yazdirin
        // sınıfları kontrol edip, istenen sınıftaki öğrencileri yazdırmak için
        // her bir value' yu gözden geçirmeliyiz

        // value'leri kaydedelim
        Collection<String> valueCollection = ogrenciMap.values();

        // sınıfları kontrol edip, istenen sınıftaki öğrencileri yazdırmak için
        // her bir value' yu gözden geçirmeliyiz


        for (String eachValue: valueCollection
             ) { // Ali-Can-11-H-MF

            //herbir value'yu split edip, class bilgisinşi kontrol etmeliyiz

            String[] eachValueArr = eachValue.split("-");//[Ali, Can, 11, H, MF]

            // array den sınıf bilgisini kontrol edip
            // istenilen sınıf değeri eşit ise
            // isim ve soyisim değerlerini yazdıralım

            int siraNo=1;
            if (eachValueArr[2].equals(sınıf+"")){

                System.out.println(siraNo +"- "+ eachValueArr[0] + " "+ eachValueArr[1]+" "+eachValueArr[2]);
                siraNo++;
            }

        }


    }

    public static void numaraAraligindakiOgrencileriyazdir(Map<Integer, String> ogrenciMap, int basNO, int bitNo) {

        // ogrenci numarası verilen iki değer arasında olan (sınır değerleri dahil)
        // tum öğrencilerin numara,isim,soyisim ve bölümlerini yazdırın



        // ogrencilerin numaralarına göre kontrol edebilmek için tüm key lere ihtiyacım var

        Set<Integer> ogrenciKeySet= ogrenciMap.keySet();//[101, 102, 103, 104, 105, 106]
        int siraNo=1;
        for (Integer eachkey:ogrenciKeySet
             ) { // 101

            if (basNO<= eachkey && eachkey<= bitNo) {
                // istenen aralıktaki key'ler buraya ulaşır, örneğin 103
                // burada o key e ait isim,soyisim ve bölüme ulaşmalıyız

                String value = ogrenciMap.get(eachkey); // Ali-Cem-11-K-MF

                String[] valueArr = value.split("-"); // [Ali-Cem-11-K-MF]

                System.out.println(siraNo+"- "+
                                    eachkey+" "+
                                    valueArr[0]+" "+
                                    valueArr[1]+" "+
                                    valueArr[4]);
                                    siraNo++;

            }

        }


    }

    public static Map<Integer, String> numaraIleSoyisimUpdateEt(Map<Integer, String> ogrenciMap, int ogrcNo, String han) {


        // 102 numaralı ogrencinin value'sunu kaydet Veli-Cem-10-K-TM
        String value = ogrenciMap.get(ogrcNo);

        // update yapabilmek için bilgileri split etmeliyiz [Veli, Cem, 10, K, TM]
        String[] valueArr = value.split("-");

        // bu array de soyisim olarak yeni soy ismi atayabilirim [Veli, Han, 10, K, TM]
        //valueArr[1]= yeniSoyisim;

        // bu array deki güncel bilgileri value yapısına uygun olarak yeniden birleştirmeliyiz
        // [Veli, Han, 10, K, TM]
        value = valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+valueArr[4];

        // 102 numaralı öğrenciyi yeni value'su ile map'e ekleyelim
        ogrenciMap.put(ogrcNo,value);

        // keyler unique olduğu için
        // varolan bir elementi yeniden eklemek isterseniz
        // key olduğu için




        return ogrenciMap;
    }

    public static void numaralıTumOgrenciListesiYazdir(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMapOlustur().entrySet();

        //
        // bu şekilde map ile değil set ile uğraşmış olacağız
        // tek bir for-each loop ile hem key hemde value e ulaşabiliriz

        System.out.println("No    Isim     Soyisim      sinif");
        System.out.println("___________________________");
        //ogrenci listesini numara-isim-soyisim-sınıf şeklinde yazdıralım
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            String ogrenciValue = eachEntry.getValue();// Ali-Can-11-H-MF
            String[]ogrenciValueArr = ogrenciValue.split("-"); // Ali-Can-11-H-MF


            System.out.println(eachEntry.getKey()+" "+ogrenciValueArr[0]+" "
                    +ogrenciValueArr[1]+" "+ogrenciValueArr[2]);

        }
                /*
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-MF,
                    103=Ali-Cem-11-K-MF,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF
                  */
    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {

        // tum entry leri ele almak için bir entrySet oluşturalım

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti= ogrenciMap.entrySet();

        // ogrenci EntrySet inde her bir entry i ele alıp
        // istenen update i yapalım

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            // sınıfı update edebilmek için önce value u parçalayıop
            // isteneN bilgiye ulaşap update edeceğim
            String eachValue = eachEntry.getValue();//101=Ali-Can-11-H-MF
            String[] eachValueArr = eachValue.split("-");//[Ali-Can-11-H-MF]

            // array de 2.index deki sınıf bilgisini inceleyip
            // gerekli update i yapalım
            // 9-10-11 ==>bir arttır, 12==>mezun, Mezun==> dokunma

            if (!eachValueArr[2].equalsIgnoreCase("Mezun")) {

                Integer sinif = Integer.parseInt(eachValueArr[2]);//11

                if (sinif < 12) {
                    sinif++;
                    eachValueArr[2] = "sinif";
                } else {
                    eachValueArr[2] = "Mezun";
                }

               // [Ali-Can-11-H-MF]
            }

            // bilgi update edildikten sonra array'de yapılan değişikliğin
            // map e işlenmesi için, herbir entry'i update edelim

            eachEntry.setValue(eachValueArr[0]+"-"+ eachValueArr[1]+"-"+eachValueArr[2]+
                    "-"+eachValueArr[3]+"-"+eachValueArr[4]);

            }
        return ogrenciMap;

        }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {
        // soyisimleri buyuk harf yap

        // soyisim bilgiine ulasıncaya kadar bol
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {

            String eachValue = eachEntry.getValue();//Ali-Can-11-H-MF
            String[] eachvalueArr = eachValue.split("-");//[Ali-Can-11-H-MF]

            // soyisim bilgisini update et
            eachvalueArr[1] = eachvalueArr[1].toUpperCase();//[Ali-Can-11-H-MF]

            // soyismin yeni hali ile map ı update et

            eachEntry.setValue(eachvalueArr[0] + "-" + eachvalueArr[1] + "-" + eachvalueArr[2]
                    + "-" + eachvalueArr[3] + "-" + eachvalueArr[4]);

        }
            return ogrenciMap;
        }
    }

