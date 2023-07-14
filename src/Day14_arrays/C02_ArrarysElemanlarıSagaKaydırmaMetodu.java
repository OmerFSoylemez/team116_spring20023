package Day14_arrays;

import java.util.Arrays;

public class C02_ArrarysElemanlarıSagaKaydırmaMetodu {

    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn : input : [4,5,6,7]  array’in son hali : [7,4,5,6]

        // 1) sondaki elemanı geçici bir yere kaydet
        // 2) elemanları sağa kaydır
        // 3) son elemanı başa koy

        int [] input ={4,5,6,7};
        System.out.println(Arrays.toString(input));

        input = elemanısagakaydirma(input);// metodu kullanarak çaığırdık

        System.out.println(Arrays.toString(input));


    }
        //methodun (makinanın) kendisi
    public static int [] elemanısagakaydirma ( int []input) {

        //[4,5,6,7]

        // 1) array'in son elemanını kaydet. Length kullanarak dinamik yap.
        int gecici = input[input.length - 1];// son eleman index lenght_1

        // 2) dinamik olarak elemanı sağa kaydır.

        for (int i = input.length - 2; i >= 0; i--) {
            input[i + 1] = input[i];


        }
        // 3) kaydedilen geçici elemanı başa koy
        input[0]=gecici;

       return input;// updated(değiştirilen)   array methodun çağrıldığı yere döndürülüyor.

    }

}
