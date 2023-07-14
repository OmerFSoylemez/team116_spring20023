package Day08_StringManipulations;

public class C08_nullPointer {
    public static void main(String[] args) {

        /*
        null bir değer değildir
        null bir pointerdır
        non-primitive datalara değer atanmadığını işaret eder.
         */
        String str; //değer  atanmadığı için yazdırma vs işlemleri yapılamıyor.

        //System.out.println(str);//CTE// değer atama yapılmadan normalde yazdırma yapılamaz

        /*
       yinede değer ataması yapmadan, boş olarak kalmasını, lakin en azından yeri geldiği zaman en azından
       yazdırılabilmesini istiyorsak null pointer kullanılır
         */

        str = null ;// str'a bir değer atanmadı, sadece boş olduğunu bildiğimizi java ya bildirdik
                    // str hala boş

        System.out.println(str); //null içinde birşey olmamasına karşın nullpointer ile gösterildiği için
                                // en azından yazdırma işlemi yapılabilir

        /*
        yazdırma gibi işlemlerde hata vermemesi için boş değere null ataması yapılır.
         */
        //str.concat("Ali"); //NullPointerException //null olan bir değer ile metodlar kullanılmaz

        // System.out.println(str.length()); //yok olan birşeyin uzunluğu ölçülemez

        String test = ""; //burda testin içnde "" kayıt altına alınmış, kullanılabilir
        System.out.println(test.length());

        System.out.println(str+"Ali");

        Integer sayi =null;

        //str = null ,,,test ="";

        // System.out.println(str.isEmpty());// null pointer exception, olmayan bir şeyin boş olup olmadığını kontrol edemeyiz
        System.out.println(test.isEmpty());//true




    }
}
