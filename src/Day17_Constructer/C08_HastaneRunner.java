package Day17_Constructer;

public class C08_HastaneRunner {

    public static void main(String[] args) {

        C07_Hastane per1 = new C07_Hastane();

        System.out.println("İsim :"+per1.personelIsmi+
                ",adres:"+per1.personelAdresi+
                ",Telefon:"+per1.personelTelefon+
                ",personel turu:"+per1.personelTuru);

        System.out.println(per1);

        C07_Hastane per2 = new C07_Hastane("Selgun");

        System.out.println(per2);
    }


}
