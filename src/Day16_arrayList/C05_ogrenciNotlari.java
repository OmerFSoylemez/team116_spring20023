package Day16_arrayList;

import java.util.List;

public class C05_ogrenciNotlari {

    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasını ve kaç ogrencinin ortalamanın üztünde not aldığını
        // bize ulaştıran bir method yazın

        List<Integer> notlarListesi = C04_KullanicidenIntListOlusturma.kullanicidanSayiAlarakListeOlusturanMethod();
        notOrtVeOrtUstOgrenciSay(notlarListesi);

    }

    public static void notOrtVeOrtUstOgrenciSay(List<Integer> notlarListesi) {
        // not ortalaması

        int toplamNot = 0;
        int ortalamaNot = 0;
        int sayac = 0;

        // toplam notu bulmak için listedeki bütün elemanları toplayan loop
        for (int i = 0; i <notlarListesi.size() ; i++) {
            //10 25 35 95 99 98
            toplamNot= toplamNot + notlarListesi.get(i);

        }
        //notlar toplamı/ogrenci sayisi= ortalama not
        ortalamaNot = toplamNot / notlarListesi.size();// integer olduğu için ortalama notun küsüratı olmayacak

        //not ortalaması üzerinde öğrenci sayisi

        for (int i = 0; i <notlarListesi.size() ; i++) {
            //10 25 35 95 99 98
            if(notlarListesi.get(i)>ortalamaNot) {
                sayac++;
            }

        }
        System.out.println("sınıftaki ogrenci sayisi:"+notlarListesi.size());
        System.out.println("sınıfın ortalama notu:"+ortalamaNot);
        System.out.println("sınıfta ortalama not üstü ogrenci sayisi:"+sayac);
    }
}
