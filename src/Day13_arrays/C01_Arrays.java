package Day13_arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        String[] arr1 = {"Ayten","Sevda","Adem"};

        // Array'i yazdirmak istersek
        // Arrays class'indan toString() kullanmaliyiz

        System.out.println(arr1); //[Ljava.lang.String;@568db2f2

        System.out.println(Arrays.toString(arr1));//[Ayten, Sevda, Adem]

        /*
            köşeli parantez içinde elementleri yazdirir
            elementler arasında bir virgül ve bir space bırakır.
         */

        //bir array'in uzunlığuna ulaşmak istesek
        //array'de kaç tane element olduğunu gösterir
        //method değil variable dır, yanında () yok

        System.out.println(arr1.length); //3

        int[] arr2 = new int[6];

        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 0, 0]

        arr2[0] = 5;
        arr2[3] = 9;
        arr2[4] = 1;

        System.out.println(Arrays.toString(arr2)); //[5, 0, 0, 9, 1, 0]




    }
}
