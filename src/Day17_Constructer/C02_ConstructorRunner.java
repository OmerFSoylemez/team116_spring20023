package Day17_Constructer;

public class C02_ConstructorRunner {
    public static void main(String[] args) {
        //Bu class'dan C01 class'ındaki
        //variable ve methodlara ulaşmak istiyorum.


        //Başka class daki static calss üyelerine
        //ulaşmak için

        System.out.println(C01_Constructer.isHappy);
        C01_Constructer.staticMethod();

        // static olmayan class üyelerine ulaşmak için
        // o class da obje oluşturmamız lazım

        C01_Constructer obje = new C01_Constructer();

        //bastaki C01_Constructor==> class adi ve objenin data türü
        //obje==> objenin adi
        //new==> yeni obje oluşturmak için keyword
        /* C01_Constructors() ==>Constructor
           Bir objenin oluşturulması ve ilk değer atamasının(initialise)
           yapılması için mutlaka constructor çalışmalıdır.

           Java bir class oluşturulduğunda
           o class dan obje oluşturlması için
           her class a otomatik olarak
           default bir constructor yerleştirilir

           bu default constructor lar görünmez
         */

        System.out.println(obje.str);
        obje.sayi=20;
        obje.staticOlmayanMethod();

    }
}
