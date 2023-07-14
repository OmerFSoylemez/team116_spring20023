package Day13_arrays;

public class C03_ArrayinElemanlarınıToplama {

    public static void main(String[] args) {

        //verilen int[] in tüm elemanlarını toplayıp
        // sonucu yazdıran method oluşturun

        int[] arr = {2,4,6,8,1,3,8,2,3,5,6};

        elemanlarToplaminiYazdir(arr);

    }
    public static void  elemanlarToplaminiYazdir(int[] arr){
        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {

            toplam += arr[i];

        }

        System.out.println("Array'deli elemanların toplamı :"+toplam);
    }
}
