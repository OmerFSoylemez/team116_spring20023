package day28_Interface;

public interface I01_Interface {
    /*
        Interface'ler class degildir
        Interface full abstraction sagladığı icin
        Interface'in deklarasyonunda abstract yazmasına gerek yoktur
        java otomatik olarak Interface'leri abstract tanımlar

        Aynı şekilde interface ler için de oluşturulan metodlar içinde
        public veya abstract yazamaya gerek yoktur
        Java tum method'ları public ve abstract olarak kabul eder.

        Inreface'ler tum class lar için bir Şablon özelliği taşır
        To do List ==> yapılacaklar Listesi
     */
        int SAYI=20;
        //Java'da static ve final variable isimleri büyük harf ile oluşturulur.



    public abstract void method1();
    abstract int method2();
    public String method3();
    //double method4();
}
