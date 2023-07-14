package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {

    public static void main(String[] args) {

      /*
        Asagidaki body’yi map olarak olusturun
        {
            “firstname” : “Ahmet”,
            “lastname” : “Bulut”,
            “totalprice” : 500,
            “depositpaid” : false,
            “bookingdates” : {
                   “checkin” : “2021-06-01”,
                   “checkout” : “2021-06-10”
                      },
            “additionalneeds” : “wi-fi” }

            key     :String
            value   :String, Integer, Boolean, Map<String,String>
         */

        Map<String,Object> rezervasyonMap = new HashMap<>();

        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice","500");
        rezervasyonMap.put("depositpaid","false");

        Map<String,String> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checin","2021-06-01");
        bookingDatesMap.put("checout","2021-06-10");
        rezervasyonMap.put("bookingdates",bookingDatesMap);

        rezervasyonMap.put("additionalneeds","wi-fi");

        System.out.println(rezervasyonMap);
        /*




        */

        //bu rezervasyonmap de isim bilgisini yazdırın
        System.out.println(rezervasyonMap.get("firstname"));

        //bu rezervasyonmap de additionalneeds bilgisini yazdırın
        System.out.println(rezervasyonMap.get("additionalneeds"));

        // bu rezervasyonmap de spyisimin ilk harf bilgisinş yazdırın
        System.out.println(((String) rezervasyonMap.get("lastname")).charAt(0)); //B

        System.out.println(rezervasyonMap.get("yas"));// null

        //rezervasyonmap de checkin bilgisini yazdırın

        System.out.println((((Map) rezervasyonMap.get("bookingdates")).get("checkin")));


    }
}
