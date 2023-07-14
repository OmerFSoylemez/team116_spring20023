package Day16_arrayList;

import java.util.Arrays;
import java.util.List;

public class C07_asList {

    public static void main(String[] args) {

        Integer[] arr= {1,2,3};

        //Verielen bir array i liste çevirmek için for loop oluşturup liste eklemeyi tavsiye ediyoruz

        // yinede görmek adına aslist methodu kullanalım

        List<Integer>arraydenList= Arrays.asList(arr);

        System.out.println(arraydenList); //[1, 2, 3]

        System.out.println("Array : "+Arrays.toString(arr));
        System.out.println("Arraydan List:"+arraydenList);

        //oluşturulan listeye ekleme çıkarma yapılabilmelli

        //arraydenList.add(5); //UnsupportedOperationException
        //arraydenList.remove(1);//UnsupportedOperationException

        arr[0] = 23;
        System.out.println("Array :"+Arrays.toString(arr));
        System.out.println("arrayi değiştirdikten sonra listin hali:"+arraydenList);

        /*
        Bir arrayi Listeye çevirirken asList methodu kullanmanın iki ana negatif yönü vardır:

        1-asList methodu ile oluşturulan liste, esnek bir yapıya sahip değildir.Ekleme ve çıkara yapamayız.
        2-Kaynak array değiştirldiği zaman, otomatik olarak bu arrayden oluşturulan liste de değişir.
         */
    }
}
