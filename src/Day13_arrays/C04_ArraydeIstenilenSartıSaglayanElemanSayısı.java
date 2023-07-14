package Day13_arrays;

public class C04_ArraydeIstenilenSartıSaglayanElemanSayısı {

    public static void main(String[] args) {

        int[]arr ={2,4,6,8,1,3,8,2};

        //array'de kaç tane çift sayi olduğunu yazdırın.

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]%2==0){
                sayac++;
            }

        }

        System.out.println("Verilen array daki çift sayi adedi;" +sayac);


        //array'de 3 ile bölünebilen kaç sayi olduğunu yazdırin
        sayac=0;
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]%3 ==0){
                sayac++;
            }

        }

        System.out.println("Verilen array'deki 3'e bölünen sayı adedi:" +sayac);


        //verilen array de 4 ile 8 (sınırlar dahil) arasında kaç sayi olduğunu yazdirin.

        sayac= 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>=4 && arr[i]<=8){
                sayac++;
            }

        }

        System.out.println("Verilen array'de istenen aralıktaki sayı adedi:"+sayac);
    }
}
