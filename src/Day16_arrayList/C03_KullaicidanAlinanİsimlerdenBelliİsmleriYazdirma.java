package Day16_arrayList;

import java.util.List;

public class C03_KullaicidanAlinanİsimlerdenBelliİsmleriYazdirma {

    public static void main(String[] args) {

        //kullanıcıdan alınan isimlerden oluşan listede 3 harften fazla olan isimleri yazdirin

        List<String> yeniIsimler = C02_KullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        //listenin elemanlarına ulaşmak için bir loop
        //listenin elemanları eger 3 harf veya fazlaysa yazdiran code

        for (int i = 0; i <yeniIsimler.size() ; i++) {

            if (yeniIsimler.get(i).length()>=3){
                //ahmet hasan hüseyin ali ad su
                System.out.println(yeniIsimler.get(i));
            }

        }
    }
}
