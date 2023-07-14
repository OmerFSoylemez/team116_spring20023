package Day13_arrays;

import java.util.Arrays;

public class C02_TumElementlereErisim {

    public static void main(String[] args) {
        /*
        Bir array 'i yazdırmak ile elementleri yazdırmak farklıdır.
        bir array'i yazdırmak istersek Arrays.toString() ile yazdırırız
        standart olarak iki tarafında köşeli parantes olur
        aralarında da space bulunur

        Elementleri yazdırmak istediğimizde ise loop kullanırız
        ve nasıl yazacağımız bize bağlı olur
         */

        int[] arr = {2,4,6,8,1,3,8,2};

        // bu array i yazdirin

        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8, 1, 3, 8, 2]

        // array in tüm elementlerini yan yana aralarında - olacak şekilde yazdırın

        System.out.print(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]+"-");

        System.out.println(" ");

        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.print(arr[i]+"-");

        }
        System.out.print(arr[arr.length-1]);


    }
}
