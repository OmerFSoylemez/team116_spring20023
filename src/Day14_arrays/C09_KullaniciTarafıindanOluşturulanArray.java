package Day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullaniciTarafıindanOluşturulanArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan array boyutunu al
        System.out.println("Lütfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int [arrayBoyut];

        int arrayElementi=0;

        //array in boyutu kadar şoop ile array in elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println("litfen arrayin " +i+"ci elemanını giriniz");
            arrayElementi= scan.nextInt();
            arr[i]= arrayElementi;



        }
        System.out.println(Arrays.toString(arr));
    }

    public static int [] kullaniciArrayOlusturma(){
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan array boyutunu al
        System.out.println("Lütfen array boyutunu giriniz");
        int arrayBoyut = scan.nextInt();
        int [] arr = new int [arrayBoyut];

        int arrayElementi=0;

        //array in boyutu kadar şoop ile array in elemanlarını kullanıcıdan alıyoruz
        for (int i = 0; i <arrayBoyut ; i++) {
            System.out.println("litfen arrayin " +i+"ci elemanını giriniz");
            arrayElementi= scan.nextInt();
            arr[i]= arrayElementi;



        }
        return arr;
    }
}
