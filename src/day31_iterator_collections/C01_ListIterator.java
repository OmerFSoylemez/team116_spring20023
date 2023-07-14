package day31_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar);//[5, 12, 3, 9]

        //index kullanmadan listenin tüm elementlerine kalıcı olarak 2 ekleyin

        ListIterator lit = sayilar.listIterator();

        Integer sayi = 0;

        while (lit.hasNext()){

            sayi = (Integer) lit.next();

            lit.set(sayi+2);
        }
        System.out.println(sayilar);

        // iterator kullanarak listin elemntlerini sondan başa doğru yazdırın

        // yukarıdaki işlemden dolayı iteratar en sonda

        while (lit.hasPrevious()){
            System.out.print(lit.previous() + " ");
        }

        //iteratar ı nerede bırakırsak orada kalır.
        // başta olduğundan emin olmak istyerseniz
        // ya yeni bir iterator oluşturursunuz
        // veya loop body si boş olan bir while loop  ile en başa gidersiniz

        // orneğin iterator i en sona götürelim

        while (lit.hasNext()){
            lit.next();

        }
        System.out.println("\n"+lit.previousIndex());//3
        System.out.println(lit.nextIndex());//4







    }
}
