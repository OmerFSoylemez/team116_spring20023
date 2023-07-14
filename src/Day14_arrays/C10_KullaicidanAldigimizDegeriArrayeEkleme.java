package Day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C10_KullaicidanAldigimizDegeriArrayeEkleme {

    public static void main(String[] args) {

        /*
        SORU 7- verilen bir array e istenilen bir elemanı ekleyip bize döndüren bir method yazın,
        eski array e yeni deüeri atayın.
         */

        int[] arr1= {2,4,6,8}; // bu array e 5 ekleyiniz

        // 1- Eski arrayin uzunluüuna 1 ekleyip yeni array oluşturulması
        // 2- Eski array in değerlerinin koopyalanması
        // 3- Kullanıcıdan alınan değeri, yeni array in boş son gözüne konulması

        // 1- Eski arrayin uzunluüuna 1 ekleyip yeni array oluşturulması
        int [] yeniArr= new int[arr1.length+1];

        // 2- Eski array in değerlerinin koopyalanması

        for (int i = 0; i < arr1.length ; i++) {

            yeniArr[i] = arr1[i];

        }
        //System.out.println(Arrays.toString( yeniArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arraya eklenecek değeri giriniz");
        int eklenecekDeger = scan.nextInt();

        yeniArr[yeniArr.length-1]= eklenecekDeger;

        System.out.println(Arrays.toString(yeniArr));
    }

    public static int [] kullaniciArrayElemanEkleme ( int[] arr1) {
        // 1- Eski arrayin uzunluüuna 1 ekleyip yeni array oluşturulması
        // 2- Eski array in değerlerinin koopyalanması
        // 3- Kullanıcıdan alınan değeri, yeni array in boş son gözüne konulması

        // 1- Eski arrayin uzunluüuna 1 ekleyip yeni array oluşturulması
        int [] yeniArr= new int[arr1.length+1];

        // 2- Eski array in değerlerinin koopyalanması

        for (int i = 0; i < arr1.length ; i++) {

            yeniArr[i] = arr1[i];

        }
        //System.out.println(Arrays.toString( yeniArr));

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arraya eklenecek değeri giriniz");
        int eklenecekDeger = scan.nextInt();

        yeniArr[yeniArr.length-1]= eklenecekDeger;

        arr1=yeniArr;

        return arr1;

    }
}
