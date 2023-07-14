package day04_increment_concatination;

public class C05_KarşılaştırmaOperatörleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        /* Karşılaştırma operatörleri
            2 variable ı karşılaştırıp
            istenen şart sağlanıyorsa true
            şart sağlanmıyorsa false
            değeri üreten operatörlerdir.
         */

        System.out.println(a=b);

        // a b ye eşit mi?

        System.out.println(a == b);//false

        System.out.println(2*a == b);// true

        System.out.println(a == b/2);// true

        // a ile b'nin eşit olmadığını kontrol edin

        System.out.println(a != b); // true

        System.out.println(a != b/2); //false

        //a b'den küçük mü?

        System.out.println(a<b);//true

        System.out.println(a<b/2); //false

        // a b'den küçük değil şartını kontrol edelim

        System.out.println(!(a<b));//false

        //a b'den küçük veya eşit mi?

        System.out.println(a<=b);//true

        System.out.println(2*a<=b);//true

        // a b'den büyük mü?

        System.out.println(a>b);//false

        System.out.println(5*a>2*b);//true


        boolean c = 2*a>=b; //true

        //a'nin 3 katinin b'den büyük olmadığı şartını kontrol edin

        System.out.println(  !(a*3>b)  ); // false



    }
}
