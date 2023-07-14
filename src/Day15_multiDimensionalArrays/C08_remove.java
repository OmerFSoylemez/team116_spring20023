package Day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {

    public static void main(String[] args) {

        /*
        Eger listemiz sayılardan oluşuyorsa
        Java girilen sayı index mi yoksa obje mi diye düşünmez
        direk index olarak kabul eder

        İllada objeyi vermek isterseniz
        önce silmek istediğiniz objeyi oluşturup
        sonra Integer değeri değil, obje ismini yazarak remove edebilirsiniz

        Eger silmek istediğiniz obje birden fazla ise
        ilkini siler
         */

        int[] sayilar = {3,5,6,3,1,2,5,7,5,3,4,2,3,5,6};

        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i <sayilar.length ; i++) {
            sayiList.add(sayilar[i]);

        }
        System.out.println(sayiList);//[3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.remove(5));//2

        System.out.println(sayiList);//[3, 5, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        System.out.println(sayiList.remove(1));//5

        System.out.println(sayiList);//[3, 6, 3, 1, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        Integer silinecekObje =5;

        sayiList.remove(sayiList.remove(silinecekObje)); //true

        System.out.println(sayiList);//[3, 6, 3, 1, 7, 5, 3, 4, 2, 3, 5, 6]


    }
}
