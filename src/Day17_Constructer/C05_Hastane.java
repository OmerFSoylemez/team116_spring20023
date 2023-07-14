package Day17_Constructer;

public class C05_Hastane {

    /*
    Bir class da görünürde constructor yoksa
    default constructor vardır.

    default constructor parametresiz bir constructor a
    benzer C05 Hastane () {

    }
    ancak bir constructor görünür ise
    artık ona default constructor demeyiz
    parametresi yoksa ona parametresiz constructor diyebiliriz

    biz herhangi bir constructor oluşturursak
    java default construktor ı siler
    yani bir class da görünür bir constructor varsa
    DEFAULT CONSTRUCTOR yoktur, diyebiliriz.


     */

    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "03123454545";

    String personelIsmi = "İsim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefon = "Telefon belirtilmedi";
    String personelTuru = "Personel Türü Belirtilmedi";

    public int maas() {

        switch (personelTuru) {
            case "Doktor":
                return 5000;

            case "Hemsire":
                return 3000;

            case "Bashemsire":
                return 4000;

            default:
                return 1900;

        }
    }
}