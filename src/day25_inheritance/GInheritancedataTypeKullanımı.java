package day25_inheritance;

import java.util.ArrayList;
import java.util.List;

public class GInheritancedataTypeKullanımı {

    public static void main(String[] args) {

        String str="Java Candir";
        Integer sayi= 20;
        Boolean bl = true;

        Object obj1 = str; // String is a Object
        Object obj2 = sayi; // Integer is a Object
        Object obj3 = bl; // Blooean is a object
        Object obj4 = new String("Tava");
        Object obj5 = new Integer(20);
        Object obj6 = new Boolean(true);

        // Integer dnm1 = str; String is a Integer diyemeyiz

        ArrayList<String> isimler1 = new ArrayList<>();
        List<String>isimler2 =new ArrayList<>();// ArrayList is a List

        // ArrayList AbstractList'in Child'i
        // AbstractList'de List 'in Child'ı

        /*
            Java da bir obje oluşturduğumuzda
            Object obj1 = str;
            List<String>isimler2 =new ArrayList<>();

            DataTuru variableIsmi = deger ;

            Burada kullandığımız String,Object,Integer...hem data türüdür, hem de class adıdır


            Eger non-primitive data türlerinden bahsediyorsak
            eşitliğin sol tarafındaki dataTuru olan class ile constructor'in
            kullanıldığı class'lar arasında is a relationship olmalıdır.






         */


    }
}
