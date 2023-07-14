package day29_exceptions;

public class C06_CatchBlogu_e_kullanımı {

    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=2;

        try {

            System.out.println(sayı1/sayı2);
            System.out.println("acıklama 1");
            System.out.println("acıklama 2");
            System.out.println("acıklama 3");

        } catch (Exception e) {

            /*
                burada kullanılan e oluşan expection ı atayabileceğimiz bir variable dır
                Exception e = olusanHata;
                seklinde bir variable oluşturulmuş ve değer atanmış olur
                catch blogu içerisinde e için hazırlanmış method'lar kullanılarak
                istediğimiz şekilde hata mesajları yazdırılabileceği gibi
                hazır method ları kullanmayıp
                kendi mesajımızı da yazdırabiliriz
             */

            /*
                Bir try blogunda sorun ile karşılmazsa
                kod normal olarak çalışmaya devam eder
                try blogundaki tüm kodlar çalıştırılır ve catch blogu devreye girmez

                try blogunda exception olusursa
                exception oluşan satır ile catch blogu arasında kalan kodlar ÇALIŞMAZ
                Ignore edilir
                Catch blogu devreye girer,
                catch blogundaki kodlar çalışıp bitince
                kod catch blogundan sonra çalışmaya devam eder

             */

           // e.printStackTrace(); //exception daki tum hata mesajını yazdırır ama yoluna devam eder.
            System.out.println(e.getMessage()); // by zero



        }

        System.out.println("Catch blok sonrası");
    }
}
