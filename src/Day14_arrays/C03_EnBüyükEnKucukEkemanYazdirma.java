package Day14_arrays;

import java.util.Arrays;

public class C03_EnBüyükEnKucukEkemanYazdirma {

    public static void main(String[] args) {

        /*
        Bir array in en büyük ve en küçük elemanını yazdırın
         */

        int [] arr= {2,5,8,7,6,4,5,9,1,2,3,};

        System.out.println(Arrays.toString(arr));

        enBuyukVeEnKucukElemanYazdırma(arr);

        //sadece sayılar değil yazılar içinde geçerli , sort kullanabiliriz.

        String [] arrStr = {"Ali","Veli","Hasan"};
        Arrays.sort(arrStr);
        System.out.println(Arrays.toString(arrStr));

    }


    public static void enBuyukVeEnKucukElemanYazdırma(int[]arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("array in en küçük elemanı :"+ arr[0]);

        System.out.println("array in en büyük elemanı :"+ arr[arr.length-1]);
    }
}
