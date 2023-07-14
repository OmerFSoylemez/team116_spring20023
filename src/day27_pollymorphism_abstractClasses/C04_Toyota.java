package day27_pollymorphism_abstractClasses;

public class C04_Toyota extends C03_Araba {

    public static void main(String[] args) {

        /*
            Satışa çıkan tüm araçalar için somut değerler atanmalıdır
            child class lar parent class daki TUM METHOD LARI OVERRİDE ETMEK ZORUNDA olsun

            Normal parent-child ilişkisinde MECBURİYET yoktur.
            Child Class istese OVERRİDE eder, istemezse etmez

            ABSTRACTION ın temel amacı
            child class ların MUTLAKA KENDİSİNE UYARLANMASI GEREKEN metodların
            override edilmesini sağlamaktır.

            Bir class abstract yapılıp
            içerisine abstract methodlar konursa
            o class ı parent edinen
            tüm child class lar
            parent class daki abstract method ları OVERRİDE etmelidir
            aksi durumda CTE oluşur.
         */


        C04_Toyota arac1 = new C04_Toyota();
        arac1.teker();//Toyota araclar pirelli teker kullanır
        arac1.klima();//Arabaların klimaları olabilir
        arac1.motor();//toyota araçlar çevreci motor kullanır
    }


    @Override
    void teker() {
        System.out.println("Toyota araclar pirelli teker kullanır");
    }

    @Override
    void motor() {
        System.out.println("toyota araçlar çevreci motor kullanır");

    }

    @Override
    void gosterge() {
        System.out.println("Toyota araclarda tüm göstergeler vardır");

    }
}

