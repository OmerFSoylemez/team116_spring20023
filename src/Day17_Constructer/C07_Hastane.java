package Day17_Constructer;

public class C07_Hastane {


    /*
    Biz görünür bir constructor oluşturduğumuzda
    Java default constructor ı siler

    Biz görünür constructor oluşturduğumuzda, daha önce default
    constructor'ı kullanarak oluşturulan objeler CTE verir.

    Böyle bir soruna sebep olmamak için
    görünür bir constructor oluşturduğumuzda
    default constructor ın işlevini yapan
    parametresiz bir constructor da oluşturulur

     */

    public C07_Hastane(){
        System.out.println("Parametresiz constructor");

    }

    public C07_Hastane(String isim){
        System.out.println("isim parametreli constructor");
    }

    @Override
    public String toString() {
        return "C07_Hastane{" +
                "personelIsmi='" + personelIsmi + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ", personelTuru='" + personelTuru + '\'' +
                '}';
    }

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
