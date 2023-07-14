package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaVeYazdirmaMethodu {

    public static void main(String[] args) {

      List<String> isimler = new ArrayList<>();

      isimler.add("Ahmet");
      isimler.add("Kadir");
      isimler.add("Neşe");
      isimler.add("Nisa");

        ListeYazdirma(isimler);

    }

    public static void ListeYazdirma (List<String>isimler){

        System.out.println(isimler);

    }
}
