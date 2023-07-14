package Day16_arrayList;

public class C10_ForEachLoop {
    public static void main(String[] args) {


    /*
    bir array içindeki sayilardan 5'ten büyük sayilarin toplamı
     */

    int [] arr= {5,7,8,1,9,6,3,8,9,4,6,7,7,8,9,5,6,8};

    //for each loop kullandığımızda 3 unsura dikkat etmemiz gerekir;
    // her bir elementin data type(int)
    // her bir elemente ortak isim(each)
    // elementlerin geldiği kaynak

        int toplam=0;
        for (int each: arr
             ) {

            if (each>5){
                toplam +=each;// toplam= toplam+each
            }

        }

        System.out.println("Array içinde 5 ten büyük elemanların toplamı:"+toplam);
}
}