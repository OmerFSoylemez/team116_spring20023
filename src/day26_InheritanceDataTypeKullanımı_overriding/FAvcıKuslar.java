package day26_InheritanceDataTypeKullanımı_overriding;

public class FAvcıKuslar extends EKuslar {

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidirler");
    }

    public void gaga() {
        System.out.println("sivri gagali");

    }

    public static void main(String[] args) {

        /*
        Asağıda 3 objede aynı constroctor kullanmıştır
        yani 3 üde avcı kuştur.
        Ama data turu farklı seçildiği için
        özellikleri farklı olur.

        Bir obje oluşturulurken
        -   eger cons ve data türü aynı ise
            o class a gidilir
            aranan özellik varsa kullanılır,
            yoksa parent class lara bakılır
            ilk bulunan METHOD geçerli olur.
        -   ANCAK method bulununca hemen ÇALIŞTIRILMAZ
            data turu seçilen class dan
            constructor kullanılan class a doğru yapılır
            o method'un en güzel hali çalıştırılır.
         */


        FAvcıKuslar avcıKus1 = new FAvcıKuslar();
        avcıKus1.cogalma();//Kuslar-yumurtayla cogalır
        avcıKus1.beslenme();//Avcı_etle beslenirler
        avcıKus1.kanat();//Kuşlar-kanatları vardır
        avcıKus1.omur();// Hayvan-yaşar ve ölürler
        avcıKus1.gaga();//Avcı- Sivri gagalıdır.
        avcıKus1.hareket();//Avcı-Ucarlar
        avcıKus1.pence();//Avcı-penceleri vardir.
        avcıKus1.solunum();//Kuslar-Akciger solunumu yapar.


        EKuslar avcıKusgiller = new FAvcıKuslar();

        avcıKusgiller.cogalma();//Kuslar-yumurtayla cogalır
        avcıKusgiller.beslenme();//Avcı_etle beslenirler
        avcıKusgiller.kanat();//Kuşlar-kanatları vardır
        avcıKusgiller.omur();// Hayvan-yaşar ve ölürler
        avcıKusgiller.gaga();//Avcı- Sivri gagalıdır.
        avcıKusgiller.hareket();//Avcı-Ucarlar
        //avcıKusgiller.pence();//Kuslar ve Hayvan'da pence yok CTE
        avcıKusgiller.solunum();//Kuslar-Akciger solunumu yapar.


        DHayvan avciHayvangiller = new FAvcıKuslar();
        avciHayvangiller.cogalma();//Kuslar-yumurtayla cogalır
        avciHayvangiller.beslenme();//Avcı_etle beslenirler
        //avciHayvangiller.kanat();//Hayvan da yok-CTE
        avciHayvangiller.omur();// Hayvan-yaşar ve ölürler
        //avciHayvangiller.gaga();//Hayvan da yok-CTE
        avciHayvangiller.hareket();//Avcı-Ucarlar
        //avciHayvangiller.pence();//Hayvan da yok-CTE
        avciHayvangiller.solunum();//Kuslar-Akcigerle solunumu yapar.

        DHayvan hayvan1 = new DHayvan();
        hayvan1.cogalma();//Hayvan- cogalır
        hayvan1.beslenme();//Hayvan beslenirler
        //hayvan1.kanat();//Hayvan da yok-CTE
        hayvan1.omur();// Hayvan-yaşar ve ölürler
        //hayvan1.gaga();//Hayvan da yok-CTE
        hayvan1.hareket();//Hayvan-hareket ederler
        //hayvan1.pence();//Hayvan da yok-CTE
        hayvan1.solunum();//Hayvan-solunumu yapar.

        EKuslar kus1 = new EKuslar();
        kus1.cogalma();//Kuslar-yumurtayla cogalır
        kus1.beslenme();//Hayvan-beslenirler
        kus1.kanat();//Kuşlar-kanatları vardır
        kus1.omur();// Hayvan-yaşar ve ölürler
        kus1.gaga();//Kus- gagalıdır.
        kus1.hareket();//Hayvan-hareket ederler
        //kus1.pence();//Kuş veya hayvanda yok.
        kus1.solunum();//Kuslar-Akciger solunumu yapar.

        DHayvan kusHayvangiller = new EKuslar();
        kusHayvangiller.cogalma();//Kuslar-yumurtayla cogalır
        kusHayvangiller.beslenme();//Hayvan-beslenirler
        //kusHayvangiller.kanat();//Hayvan da yok-CTE
        kusHayvangiller.omur();// Hayvan-yaşar ve ölürler
        //kusHayvangiller.gaga();//Hayvan da yok-CTE
        kusHayvangiller.hareket();//Hayvan-hareket ederler
        //kusHayvangiller.pence();//Hayvan da yok-CTE
        kusHayvangiller.solunum();//Kuslar-Akciger solunumu yapar.








    }
}
