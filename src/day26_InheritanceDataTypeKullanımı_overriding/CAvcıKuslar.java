package day26_InheritanceDataTypeKullanımı_overriding;

public class CAvcıKuslar extends BKuslar {
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagalı";

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
            ilk bulunan VARIABLE geçerli olur.
         -  cons ve data turu farklı ise
            obje constructor olan class dan oluşturulsada
            özelliklerin data olan class daki gibi olmasını isteriz
            bir VARIABLE ın değerini aramaya DATA TURU olan CLASS'DAN başlanır

         Bir obje oluşturulurken data turu constructor dan farklı ise
         tum variable'ları DataTuru olan class' a göre DÜŞÜNMELİYİZ.
         */

        CAvcıKuslar avcı1 = new CAvcıKuslar();
        System.out.println(avcı1.beslenme);//avcı-et yerler
        System.out.println(avcı1.gaga);//avcı-sivri gagalı
        System.out.println(avcı1.cogalma);//kus-yumurtayla çoğalırlar
        System.out.println(avcı1.kanat);//kus-kanatlıdırlar
        System.out.println(avcı1.hareket);//avcı-ucarlar
        System.out.println(avcı1.pence);//avcı-pencelidir
        System.out.println(avcı1.solunum);//kus-akcigerle nefes alırlar
        System.out.println(avcı1.omur);//hayvan-yasar ve olurler



        BKuslar avciKusgiller = new CAvcıKuslar();
        // AvcıKuşlar is a kuslar
        System.out.println(avciKusgiller.beslenme);//hayvan-beslenirler
        System.out.println(avciKusgiller.gaga);//kus-gagaları vardır
        System.out.println(avciKusgiller.cogalma);//kus-yumurtayla çoğalırlar
        System.out.println(avciKusgiller.kanat);//kus-kanatlıdırlar
        System.out.println(avciKusgiller.hareket);//hayvan-hareket ederler
        //System.out.println(avciKusgiller.pence);//kuslar ve hayvalarda yok -CTE
        System.out.println(avciKusgiller.solunum);//kus-akcigerle nefes alırlar
        System.out.println(avciKusgiller.omur);//hayvan-yasar ve olurler


        AHayvan avciHayvanlar = new CAvcıKuslar();
        // avciKuslar is a Hayvan
        System.out.println(avciHayvanlar.beslenme);//hayvan-beslenir
        //System.out.println(avciHayvanlar.gaga);//hayvanda yok-CTE
        System.out.println(avciHayvanlar.cogalma);//hayvan-çoğalırlar
        //System.out.println(avciHayvanlar.kanat);//hayvanda yok-CTE
        System.out.println(avciHayvanlar.hareket);//hayvan-hareket ederler
        //System.out.println(avciHayvanlar.pence);//hayvanda yok-CTE
        System.out.println(avciHayvanlar.solunum);//hayvan-nefes alırlar
        System.out.println(avciHayvanlar.omur);//hayvan-yasar ve olurler





    }
}
