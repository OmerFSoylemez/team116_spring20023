package Day16_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C13_listeOlusturmaVeElemanEkleme {

    public static void main(String[] args) {


        //Liste+elemanların turu +isim= newArrayList<>();
        List<String> isimListesi= new ArrayList<>();

        // add ile ekleniyor
        isimListesi.add("Hasan");
        isimListesi.add("ali");
        isimListesi.add("mehmet");
        isimListesi.add("ramazan");
        isimListesi.add("yasir");
        isimListesi.add("ömer");

        System.out.println(isimListesi);

    }


}
