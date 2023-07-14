package Day14_arrays;

import java.util.Arrays;

public class C01_ArraysElemanlarıKaydırma {
    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali : [7,4,5,6]

       int [] input = {4,5,6,7};
       int [] output = new int[4];

        System.out.println(Arrays.toString(input)); //[4, 5, 6, 7]
        System.out.println(Arrays.toString(output));//[0, 0, 0, 0]

        //1)son elemanı geçici bir yere kaydet
        int gecicikayıtyeri= input[3];

        //2) elemanları saüa kaydırdık
        output[3] = input[2];
        output[2] = input[1];
        output[1] = input[0];

        System.out.println(Arrays.toString(output));//[0, 4, 5, 6]
        //3)kaydettiğimiz son elemanı arrayin başına kaydettik
        output[0]= gecicikayıtyeri;

        System.out.println(Arrays.toString(output));//[7, 4, 5, 6]


    }
}
