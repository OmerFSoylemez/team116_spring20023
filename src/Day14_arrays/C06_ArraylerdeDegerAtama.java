package Day14_arrays;

import java.util.Arrays;

public class C06_ArraylerdeDegerAtama {

    public static void main(String[] args) {

        String str = "Ahmet";
        str= "Mehmet";

        /*
        Arraylerin uzunluklaru değiştirilemez ama
        bir array e yeni bir array ataması yapabilirsiniz
         */

        String[] arr1 = {"ali","veli"};
        String[] arr2 = {"A","B","C"};

        // arr1={"Veli","Hasan"}; Array oluşturduktan sonra süslü parantez ile atama yapılamaz.

        arr1 = arr2;

        System.out.println(Arrays.toString(arr1));//[A, B, C]
        System.out.println(Arrays.toString(arr2));//[A, B, C]

        //eski bir array e atama yapamauız ama yeni bir array oluşturup assign edebiliriz.
        arr1 = new String[5];
        System.out.println(Arrays.toString(arr1));




    }
}
