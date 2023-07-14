package day28_Interface;

public interface I03_BodyOlanMethod {

    /*
    Interface'deki tüm methodlar public ve abstract'tır
    (yazsak da yazmasakta)

    Java kendisine gelen talepler doğrultusunda
    interface e gelen bazı method'ları
    eski class'ların implement etme zorunluluğunun olmasını sağlamıştır

    method deklerasyonuna
    default veya static keyword eklenirse
    method'un body si olabilir ve
    child class'larin implement etme mecburiyeti olmaz

    burada kullanaılan default keyword
    access modifier değildir
    method5'de görüleceği üzere public access modifier'dan
    sonra yazılmıştır

    (Bu default'un 5.farklı kullanımı)

    Aynı şekilde static keyword da kısman farklı bir kullanıma sahip
    child class dan statik olarak oluşturduğumuz method6 ya direk ulaşamıyoruz
    sadece InterfaceAdi.methodAdi() şeklinde ulaşabiliriz.

     */

    public abstract void method1();
    abstract int method2();
    public String method3();
    //double method4();

    public default void method5(){

    }

    public static int method6(){

        return 3;

    }


}
