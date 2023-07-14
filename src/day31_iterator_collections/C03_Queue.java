package day31_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        Queue<String>yemeklistesi = new LinkedList<>();

        yemeklistesi.add("Murat");
        yemeklistesi.add("Muhammed");

        //Murat ile Muhammed in arasına bir eleman ekleyelim
        // queue özelliğinden dolayı araya eleman eklenemez

        System.out.println(yemeklistesi);//[Murat, Muhammed]

        System.out.println(yemeklistesi.remove());
        //bastakini siler ve bize döndürür

        System.out.println(yemeklistesi);//[Muhammed]

        yemeklistesi.add("Sevda");
        yemeklistesi.add("Veysel");
        yemeklistesi.add("Aysegul");

        System.out.println(yemeklistesi);//[Muhammed, Sevda, Veysel, Aysegul]

        System.out.println(yemeklistesi.poll());//Muhammed

        System.out.println("poll'dan sonra :"+yemeklistesi);//poll'dan sonra :[Sevda, Veysel, Aysegul]

        Queue<String> liste2 = new LinkedList<>();
        //liste2.remove();//NoSuchElementException
        System.out.println(liste2.poll());//null

        yemeklistesi.offer("Firdevs");

        System.out.println(yemeklistesi);//[Sevda, Veysel, Aysegul, Firdevs]
        //eger kapasite sınırlaması yoksa add() ile işlevi yapar

        System.out.println(yemeklistesi.peek());//Sevda
        System.out.println(yemeklistesi);//[Sevda, Veysel, Aysegul, Firdevs]
        System.out.println(liste2.peek());//null
        //baştaki elementi silmeden bize döndürür, boş liste olursa null döndürür

        System.out.println(yemeklistesi.element());//Sevda
        System.out.println(yemeklistesi);//[Sevda, Veysel, Aysegul, Firdevs]
        //System.out.println(liste2.element());//NoSuchElementException
        //baştaki elementi silmeden bize döndürür, boş liste olursa exception döndürür


    }
}
