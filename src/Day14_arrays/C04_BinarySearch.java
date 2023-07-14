package Day14_arrays;

import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {

        int[] arr ={2,6,9,4,2,3,1,9,8,2,7};

        System.out.println(Arrays.binarySearch(arr,6));//-8
        System.out.println(Arrays.binarySearch(arr,7));//-8
        System.out.println(Arrays.binarySearch(arr,4));//-8
        System.out.println(Arrays.binarySearch(arr,2));//0

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 2, 2, 3, 4, 6, 7, 8, 9, 9]

        System.out.println(Arrays.binarySearch(arr,6));//6
        System.out.println(Arrays.binarySearch(arr,7));//7
        // var mı yok mu sorusuna cevap veriyor ama birden fazla aynı değer olabilir
        System.out.println(Arrays.binarySearch(arr,4));//5
        System.out.println(Arrays.binarySearch(arr,2));//2

        //[1, 2, 2, 2, 3, 4, 6, 7, 8, 9, 9]
        //olamayan bir sayı arattığımız zaman olsaydı şurada olurdu değerini eksi olarak veriyor.
        // elemanları saya+maya birden başlıyor
        System.out.println(Arrays.binarySearch(arr,5));//  -7

        //son rakamdan buyuk bir sayı aradığımızda son rakamdan sonra olurdu cevabı eksi olarak geliyor
        System.out.println(Arrays.binarySearch(arr,10));//  -12
        System.out.println(Arrays.binarySearch(arr,100));//  -12
        System.out.println(Arrays.binarySearch(arr,-3));//  -1
        System.out.println(Arrays.binarySearch(arr,-333));//  -1

    }
}
