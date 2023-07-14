package Day17_Constructer;

public class C04_HastaneRunner {

    public static void main(String[] args) {

        /*
        Biz bir obje oluşturduğumuzda java önce bu constructor'un varlığını teyit eder.
        Constructor varsa istenen objeyi oluşturur.
        Obje oluşturulunca instance olan bütün variable ların birer kopyaları oluşturulur.
        ve bu objelerle ilişkilendirilir.
        Objeye yeni bir atama yapmadığımız müddetçe
        objenin oluşturduğu class taki ilk değerleri kullanılır.

        obje üzerinden statik variable lara ulaşöak istediğimizde
        java önce objeye gider, o objeye ilişkilendirilen bilgilerde istenen variable ları bulamazsa
        class seviyesinde static variable lara ulaşır.

        static variable lar classa bağlıdır
        ve değiştirilirse tüm objeler için değişiklik geçerli olur.
         */

        C03_Hastane per1 = new C03_Hastane();

        System.out.println(per1.personelIsmi);
        per1.personelTuru="Doktor";
        System.out.println(per1.maas("Doktor"));

        C03_Hastane per2 = new C03_Hastane();
        System.out.println(per2.personelTuru);

        System.out.println(per1.hastaneAdi);
        per2.hastaneAdi = "Java Hastanesi";
        System.out.println(per1.hastaneAdi);

    }
}
