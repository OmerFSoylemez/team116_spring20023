package Day12_doWhileLoop_scope;

public class Hastane {
    static String hastaneismi = "Yıldız Hastanesi";
    static int personelsayısı;
    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;
    /*
        Class level'da oluşturulan variable'lar
        -eger tüm nesneler için ortak ise statik olarak
        -her bir nesne için farklı olacaksa instance olarak oluşturulur.

        bu hastanede 500 personel varsa
        500 personel için 500 isim 500 adres
        500 telefon variable ı olmak zorundadır.
        Java bunu şu şekilde çözmüş:

        bu class dan bir obje oluşturulduğunda
        java tüm instance variable ların bir kopyasını oluşturup
        o obje ile ilişkilendirir.

        Tüm class level variable için değer atma mecburiyeti yoktur
        eger değer atanırsa o değer geçerlidir.
        ancak değer atanmazsa java class level variable lar için
        default olarak belirlediği değerleri atama yapar.

        sayısal variable:0
        boolean : false
        char:hiçlik
        non primitivi:null
     */
    public static void main(String[] args) {
        System.out.println(hastaneismi); // Yildiz hastanesi
        //System.out.println(personelIsmi);
        System.out.println(personelsayısı); //0

        Hastane ayseHemsire = new Hastane();
        System.out.println(ayseHemsire.personelAdresi);
        ayseHemsire.personelAdresi="Cankaya";
        ayseHemsire.personelIsmi="Ayse";
        ayseHemsire.personelTelefonu= "3125485455";

        Hastane fatmahemsire= new Hastane();
        fatmahemsire.personelIsmi="Fatma";
        fatmahemsire.personelAdresi="Yenimahalle";
        fatmahemsire.personelTelefonu="5551232323";

        System.out.println(ayseHemsire.personelIsmi);  //Ayse
        System.out.println(fatmahemsire.personelIsmi); //Fatma

        //static variable'lara direk erişim mümkündür
        System.out.println(hastaneismi); // Yildiz hastanesi
        System.out.println(personelsayısı); // 0

        // obje üzerinden de static variable lara ulaşılabilir.
        // ancak intelij buna gerek yok diyerek bizi uyarır.

        System.out.println(ayseHemsire.hastaneismi);
        //static olan hastane ismi variable ına instance şekilde ulaşıldı diye uyarı veriyor.

        ayseHemsire.hastaneismi= "Levent Hastanesi";

        System.out.println(hastaneismi); // levent hastanesi
        System.out.println(fatmahemsire.hastaneismi);//levent hastanesi
    }
}







































































































































