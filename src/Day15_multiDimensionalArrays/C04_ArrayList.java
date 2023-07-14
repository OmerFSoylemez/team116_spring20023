package Day15_multiDimensionalArrays;

import Day14_arrays.C10_KullaicidanAldigimizDegeriArrayeEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        //Array uzunluğu değiştirilemediği için çalışma ortamında pek tercih edilmez
        // Java ekleme ve silme yapabileceğimiz bir yapı oluşturmuştur.
        //ArrayList, Array altyapısını kullanır ama uzunluk açısından esnektir

        // asagıdaki arr' e element olarak 10 u ekleyelim.

        int[] arr = {3, 5, 6};

        arr = C10_KullaicidanAldigimizDegeriArrayeEkleme.kullaniciArrayElemanEkleme(arr);

        System.out.println(Arrays.toString(arr));

        // Bir arraylist oluşturmak istersek
        List<Integer> sayilar= new ArrayList<>();

        //ArrayList in tek dezavantajı elemanları tek tek eklemek zorunda olmasıdır
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        System.out.println(sayilar);//[3, 5, 6]

    }
}

