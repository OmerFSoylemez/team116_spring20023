package Day16_arrayList;

public class C08_ForEachLoop {

    //Soru 2- Verielen int array deki her elementin karelerini alıp,
    // karelerin toplamını yazdıran bir method oluşturun.

    public static void main(String[] args) {

        int[] arr ={3,5,4,3,4};

        arrKareToplamalari(arr);

    }


    public  static void arrKareToplamalari(int[] arr){


        // array elementleri

        int toplam = 0;

        for (int each : arr
        ){
            //elementlerin kareleri toplamı

            toplam = toplam + each*each; // toplam+=each;
        }
        System.out.println("array in elemanları toplami:"+toplam);
    }
}
