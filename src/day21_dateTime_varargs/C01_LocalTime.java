package day21_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        // çalıştığı anda sistemde var olan zamanı alıp saat variable na kaydeder
        // kronometre gibi çalışmaz sadece 9.satırın çalıştığı zamanı kaydeder
        // eğer farklı satırların çalışma zamanını görmek istersek
        // o satırlardada yeni  LocalTime objeleri oluşturmalıyız

        System.out.println(saat);//19:53:44.811689100
        //zamanı saat ,dakika , saniye ve nano saniye olarak kaydeder.

        System.out.println(saat.getNano());
        System.out.println(saat.getSecond());
        //get() ları bize saatin istediğimiz bölümünü getirir.

        System.out.println(saat.withHour(14));
        System.out.println(saat.withHour(11).withSecond(0).withNano(0));//11:10
        // with() ları saatin istediğimiz bölümü istediğimiz yeni bir değer ile değiştirerek zamanı verir.

        System.out.println(saat.plusHours(100));//00:06:47.251943500
        System.out.println(saat.plusMinutes(10000));//18:46:47.251943500
        System.out.println(saat.minusHours(37).minusMinutes(22));//06:44:47.251943500
        //plus ve minus metodları saati istediğimiz miktarda ileri ve geri götürür.

        //istediğimiz saat, dakika,saniye ve nanosaniye ile zaman variable ı oluşturmak istersek

        LocalTime istenenZaman = LocalTime.of(12,23,15,10);
        System.out.println(istenenZaman);//12:23:15.000000010

        //iki zamanı birbiriyle karşılaştırmak istersek
        System.out.println(istenenZaman.isAfter(saat));//true
        System.out.println(istenenZaman.isBefore(saat));//false

        System.out.println(saat.compareTo(istenenZaman));//-1
        System.out.println(istenenZaman.compareTo(saat));// 1
        // iki zamanı karşılaştırır, küçükse negatif, büyükse pozitif bilgi döner







    }
}
