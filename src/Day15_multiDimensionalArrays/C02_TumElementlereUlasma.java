package Day15_multiDimensionalArrays;

public class C02_TumElementlereUlasma {

    public static void main(String[] args) {

        int [][] arr= {{1,5,9},{3,4},{2,8,1,2},{10}};
        /*
        tek katlı array de
        for loop oluşturuyorduk
        arr[i] bize tüm elementleri getiriyordu
        MDA olunca kat sayısınca iç içe loop oluşturmak gerekir
        bizim sorumuzda iç içe 2 loop oluşturacağız
        arr[i][j] bize tüm elementleri getirecek
         */

        // tum elementleri aralarında bir boşluk bırakarak yan yana yazalım.
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j]+ " ");
            }
        }
        System.out.println("");
        // tum elementlerin toplamını yazdırın
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam+= arr[i][j];
            }
        }
        System.out.println("Elemanların toplamı : "+ toplam);

        //MDA deki en büyük elementi yazdırın.
        int enBuyukSayi = arr [0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

            if (arr[i][j]>enBuyukSayi){
                enBuyukSayi= arr[i][j];
            }

            }

        }
        System.out.println("Array deki en büyük element:"+ enBuyukSayi);

        //MDA daki çift sayıları yazdırın.


        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] %2==0);

                System.out.print(arr[i][j]+" ");

            }

        }

    }

}
