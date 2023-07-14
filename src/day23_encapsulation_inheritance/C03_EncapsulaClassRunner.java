package day23_encapsulation_inheritance;

public class C03_EncapsulaClassRunner {
    /*
        Encapsulation'ın temel amacı read ve write yetkilerini ayırmak
        ve istediğimiz class üyesine read, istediğimiz class üyesine
        write yetkisi verebilmektir.


       access modifier'i default,protected veya public olanlarda
       read/write yetkilerini ayırmak mümkün değil.

       access modifier ı private olan class üyelerine ise
       hiç ulaşamıyoruz.
       bunu fırsata çevirelim
       normal yollarla private bir class üyesine erişilemez
       ama o class üyesine erişebilece
       ve yetkisi sınırlı olan methodlar oluşturulabilir.

         */

    public static void main(String[] args) {

        C02_EncapsulaClass obj = new C02_EncapsulaClass();
        obj.strDefault="Default";
        System.out.println(obj.strProtected);

        System.out.println(obj.getToplamsatistutari());//0

        obj.setSatısTutari(100);
        obj.setSatısTutari(200);
        obj.setSatısTutari(300);

        System.out.println(obj.getToplamsatistutari());//600
    }
}
