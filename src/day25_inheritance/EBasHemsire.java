package day25_inheritance;

public class EBasHemsire extends DHemsire{
    EBasHemsire(){

        System.out.println(adres);//adres belitilmedi
        adres="Çankaya";
        System.out.println(gorev);//Bas hemsire
        System.out.println("Genel görev :"+super.gorev);
        isim="ayşe";
        System.out.println(this.isim);//ayse
        System.out.println(super.isim);//ayse
        this.maas();//Bas Hemsire maası:3000
        super.maas();//Hemsire maası:2000
        nobet();//Bashemşireler ayda 3 gün nöbet tutar
        this.nobet();//Bashemşireler ayda 3 gün nöbet tutar
        super.nobet();//Hemsireler haftada 2 gun nöbet tutar

        ozelSigorta();//hemsireler özel sigorta yaptırabilir
        this.ozelSigorta();//hemsireler özel sigorta yaptırabilir
        super.ozelSigorta();//hemsireler özel sigorta yaptırabilir

        tazminat();//Başhemşireler 13. maaş alır
        this.tazminat();//Başhemşireler 13. maaş alır
        //super.tazminat();CTE
        //İnheritance da child da yoksa parent a bakılır
        //AMAA parent da yoksa child a bakılmaz CTE olur




    }

    String gorev="Bas Hemsire";
    String adres= "Adres belirtilmedi";

    public void maas() {
        System.out.println("Bas Hemsire maası:"+3000);
    }
    public void nobet(){
        System.out.println("Bashemşireler ayda 3 gün nöbet tutar");
    }
    public void tazminat(){
        System.out.println("Başhemşireler 13. maaş alır");
    }

    public static void main(String[] args) {

        EBasHemsire bh1 = new EBasHemsire();
        System.out.println(bh1.adres);



    }


}
