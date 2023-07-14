package day27_pollymorphism_abstractClasses;

public class C05_Nissan extends C03_Araba{
    /*
        Abstract class lar yokken class larımıza ozel bir isim vermiştik
        Ama abstract class lar devreye girince
        class türünü belirlemek için abstrack olmayan class lara CONCRETE CLASS denir

        bugüne kadar bizim oluşturduğumuz tüm class lar concrete class idi
        Concrete class/method lara concrete yazılmaz
        sadece class/method den bahsederken
        abstract olmadığını vurgulamak için concrete class/method deriz

     */

    // abstract void deneme(); kullanılmaz


    @Override
    void teker() {
        System.out.println("Nissan araçlar Lassa kullanır");
    }

    @Override
    void motor() {
        System.out.println("Nissan araçlar renault motor kullanır");
    }

    @Override
    void gosterge() {
        System.out.println("Nisan araçlarda 20 tane gösterge vardır");
    }

    public static void main(String[] args) {

        C05_Nissan nissan1 = new C05_Nissan();
        nissan1.gosterge();//"Nisan araçlarda 20 tane gösterge vardır"
        nissan1.guvenlik();//parent-"Arabaların güvenlik önlemleri olsa iyi olur"
        nissan1.klima();//parent-"Arabaların klimaları olabilir"
        nissan1.motor();//"Nissan araçlar renault motor kullanır"
        nissan1.teker();//"Nissan araçlar Lassa kullanır"

        C03_Araba nissan2 = new C05_Nissan();
        nissan2.gosterge();//"Nisan araçlarda 20 tane gösterge vardır"
        nissan2.guvenlik();//parent-"Arabaların güvenlik önlemleri olsa iyi olur"
        nissan2.klima();//parent-"Arabaların klimaları olabilir"
        nissan2.motor();//"Nissan araçlar renault motor kullanır"
        nissan2.teker();//"Nissan araçlar Lassa kullanır"
}
}