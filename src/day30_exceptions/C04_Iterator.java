package day30_exceptions;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class C04_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar);//[5, 12, 3, 9]

        // List'deki tüm elementleri 2 arttırıp yeni halini kaydedin

        for (int i= 0;  i < sayilar.size(); i++) {

            sayilar.set ( i, sayilar.get(i)+2);

        }
        System.out.println(sayilar); //[7, 14, 5, 11]

        /*
            java da farklı özelliklere sahip
            birden fazla element barondırabilen
            çok sayıda yapı vardır.

            biz bugüne kadar : array ve list gördük
            yarın: collections (LinkedList,queue,deque,Set)
            sonra: maps

            Bu yapıların hepsi index kullanmaz

         */

        // Index kullanmadan list deki elementleri 2 artırıp yazdırın

        for (Integer eachElement:sayilar
             ) {
            System.out.print(eachElement+2+"  ");
        }

        // degerleri 2 arttırıp yazdırdık ama List değişti mi? HAYIR

        System.out.println("\n"+sayilar);

        // for-each kullanarak List'in elementlerini 2 arttırıp
        // List in yeni değerlerini kaydedin

        for (Integer eachElement:sayilar
        ) {
            eachElement += 2;
        }

        System.out.println(sayilar);//[7, 14, 5, 11]

        Iterator itr = sayilar.iterator();

        /*
        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();
         */

        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }

        System.out.println(sayilar);//[]

    }
}
