package day05_ifElseStatements;

public class C01_basitIfStatements {
    public static void main(String[] args) {

        //bagımsız if cümleleri kodun geriye kalanıyla ilgilenmez
        //şarta odaklanır sart true ise body çalışır, false ise body çalışmaz
        //birden fazla bağımsız if statement varsa
        //degerlere bağlı olarak tum if body leri çalışabileceği gibi
        //hicbir if body nin çalışmamasıda mümkündür.


        int a = 20;
        int b = -75;

        if (a > b) {
            System.out.println("a b'den buyuk");
        }

        if (a % 7 == 0) {
            System.out.println("a 7'ye tam olarak bölünür");
        }
        if (b % 5 == 0) {
            System.out.println("b 5'e tam olarak bölünür");
        }
        if (a + b > 100) {
            System.out.println("sayiların toplamı 100'den buyuk");
        }

        // eger if şartından sonra süslü parantez kullanmazsak
        // java ilk ; kadar olan kısmı if body olarak kabul eder.
        // Sonraki satırlarla ilgilenmez

        //eger if şartını yazdığımız parantezden hemen sonra ;yazarsak
        //if statement;'de biter bu şarta baglı hiç kod olmaz

        /*
        if (b>0)
        System.out.println("b sıfırdan buyuk"); sadece ilk satır şarta bağlı
        System.out.println("b gerçekten 0 dan büyük");
        System.out.println("valla b 0 dan büyük");

        if (b>0);     hiçbir kod şarta bağlı değil
        System.out.println("b sıfırdan buyuk");
        System.out.println("b gerçekten 0 dan büyük");
        System.out.println("valla b 0 dan büyük");
         */
        if (b > 0) {
            System.out.println("b sıfırdan buyuk");
            System.out.println("b gerçekten 0 dan büyük");
            System.out.println("valla b 0 dan büyük");
        }
        boolean c = a + 10 > b - 5; // 31>-80 true

        if (c) {
            System.out.println("ozel şart saglandı");
        }
            if (true) ;
            {
                System.out.println("Bu yazı her zaman yazdırılır, çünkü şart hep true");
            }
            if (false) {
                System.out.println("Bu kod hiç çalışmaz");
            }
        }
    }