package day24_inheritance;

public class FCorolla extends EToyota {
    FCorolla() {
        System.out.println("Corolla constructor çalıştı");
    }

    String uretimYeri = "Turkiye";
    String modelCorolla = "Corolla";

    public static void main(String[] args) {

        FCorolla corolla = new FCorolla();
        System.out.println(corolla.model);//F Corolla
        System.out.println(corolla.marka);//E Toyota
        System.out.println(corolla.motor);//D arabalarda motor olur
        System.out.println(corolla.uretimYeri);//Turkiye
    }
}
    /*
    Bir  obje oluşturulduğunda
    Constructar çalışır ve
    class level da var olan variable ların
    bir kopyası oluşturulup objeye ilişkilendirilir

    Bir class da görünür bir constructor yoksa
    o class da default constructor vardır

    Java inheritance'da obje oluşturulduğunda
    parent class lardaki constructor ların çalışması için
    buna benzer bir mekanizma oluşturulmuştur

    extens keyword kullanılanbir class da
    var olan her constructor'ın ilk satırında
    görünür bir constructor coll yoksa
    görünmeyen bir super() constructor call vardır.
    super():parent class daki parametresiz constructor call demek
     */