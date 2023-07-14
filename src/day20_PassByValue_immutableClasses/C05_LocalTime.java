package day20_PassByValue_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05_LocalTime {

    public static void main(String[] args) {

        /*
        Java da zaman ve tarihle ilgili pek çok class vardır.
        biz 3 class göreceğiz
        LocalTime class'ı saat ile ilgili method'lar içerir.
         */

        LocalTime saatbaslangic = LocalTime.now();
        // LocalTime.now() bulunduğu satır çalıştığında bilgisayarın saatini alıp kaydeder
        // saat variable i canlı bir kronometre değil,
        // bulunduğu satırın çalıştığı zamanı kaydeden bir variable dır

        System.out.println(saatbaslangic);

        int toplam = 0;

        for (int i = 0; i <=50000 ; i++) {

            toplam+= i;

        }


        System.out.println(toplam);

        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis);

        LocalTime saat = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat);

        LocalTime saat2 = LocalTime.of(11,20,25);
        System.out.println(saat2);//11:20:25

        LocalTime saat3 = LocalTime.ofSecondOfDay(10000);
        System.out.println(saat3);//02:46:40
    }

}
