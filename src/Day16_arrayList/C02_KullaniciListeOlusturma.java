package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciListeOlusturma {
    public static void main(String[] args) {

        //kullanicidan alınan isimleri listeye kaydeden bir method oluşturalım.

        System.out.println(kullanicidanStringAlarakListeOlusturma());


    }
    //method stinglerden oluşacak bir list döndürecek
    public static List<String> kullanicidanStringAlarakListeOlusturma() {

        Scanner scan = new Scanner(System.in);

        //loop sayısı bilinmiyorsa do while yada while loop
        // kullanıcı isim yerine "0" girince program dursun.

        String kullaniciGirdisi = "";
        List<String> isimler = new ArrayList<>();

        //kullaniciGirdisi "0" a eşit olmadığı sürece loop devam etsin
        while (!kullaniciGirdisi.equalsIgnoreCase("0")) {

            System.out.println("Lütfen listeye eklemek için bir isim giriniz");
            kullaniciGirdisi = scan.next();

            //eger kullanici sifir girdiyse listeye ekleme
            if(!kullaniciGirdisi.equalsIgnoreCase("0"))

            isimler.add(kullaniciGirdisi);
        }
        return isimler;
    }

}
