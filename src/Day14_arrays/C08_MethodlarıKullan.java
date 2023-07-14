package Day14_arrays;

import Day13_arrays.C03_ArrayinElemanlarınıToplama;
import Day13_arrays.C05_ArraydekiEnBuyukSayiyiBulma;
import Day13_arrays.C07_TumElemanlarıArtır;

import java.util.Arrays;

public class C08_MethodlarıKullan {

    public static void main(String[] args) {

        int [] sayiArray= {2,2,7,4,2,4,5,7,3};
        // Bir array in bütün elemanlarına 2 ekleyin

        System.out.println(Arrays.toString(sayiArray));

        sayiArray=C07_TumElemanlarıArtır.tumElemanlariartir(sayiArray,2);

        System.out.println(Arrays.toString(sayiArray));

        C03_ArrayinElemanlarınıToplama.elemanlarToplaminiYazdir(sayiArray);

        int enBuyukSayi=C05_ArraydekiEnBuyukSayiyiBulma.enBuyukSayi(sayiArray);

        System.out.println((enBuyukSayi));

        sayiArray=C10_KullaicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(sayiArray);
        System.out.println(Arrays.toString(sayiArray));


    }
}
