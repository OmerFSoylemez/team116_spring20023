package Day13_arrays;

import java.util.Arrays;

public class C07_TumElemanlarıArtır {

    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini
        //     2 artirip bize donduren bir method olusturun.
        //     Eski array’i yeni haliyle kaydedin.

        int[] arr ={3,5,7,2,1,9};
        int artisMiktari = 2;

        arr = tumElemanlariartir(arr, artisMiktari);

        System.out.println(Arrays.toString(arr));

    }

        public static int[] tumElemanlariartir(int[] arr, int artisMiktari){

            for (int i = 0; i < arr.length ; i++) {

                arr[i]= arr[i] + artisMiktari;

            }
            return arr;
        }


}
