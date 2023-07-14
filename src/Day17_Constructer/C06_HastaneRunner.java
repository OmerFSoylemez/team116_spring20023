package Day17_Constructer;

public class C06_HastaneRunner {

    public static void main(String[] args) {

        C05_Hastane per1 = new C05_Hastane();

        System.out.println(per1.personelIsmi);//İsim belirtilmedi
        System.out.println(per1.personelTelefon);//Telefon belirtilmedi
        System.out.println(per1.personelAdresi);//Adres belirtilmedi
        System.out.println(per1.personelTuru);//Personel Türü Belirtilmedi
        System.out.println(per1.maas());//1900


        per1.personelIsmi="Adem";
        per1.personelAdresi="Çankaya";
        per1.personelTelefon="5558987878";
        per1.personelTuru="Doktor";


        System.out.println(per1.personelIsmi);//Adem
        System.out.println(per1.personelTelefon);//5558987878
        System.out.println(per1.personelAdresi);//Çankaya
        System.out.println(per1.personelTuru);//Doktor
        System.out.println(per1.maas());//5000


    }
}
