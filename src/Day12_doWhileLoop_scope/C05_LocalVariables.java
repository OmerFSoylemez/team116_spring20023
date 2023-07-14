package Day12_doWhileLoop_scope;

public class C05_LocalVariables {


        /*
            Kural 1- Local variable lar sadece kendi scope'larında geçerlidir
                     Bir metod da oluşturulan local variable başka metod'da kullanılmaz.

            Kural 2- Local bir scope da değer atamadan local variable oluşturabilirsiniz
                     Ancak değer atamadan kullanamazsınız

            Kural 3- Bir loop içerisinde oluşturulan variable'lar
                     sadece o loop içerisinde geçerlidir.
                     o loop dışında kullanılamaz
                     bunlara loop variable da denir.
         */

    public static void main(String[] args) {
        int sayi = 10;
        //    str = "Java Candir";
        //    yeterMi = false;


        String slogan = "Java candir";
        System.out.println(slogan);
        slogan= "Java Hayattir";

        String s;

        // System.out.println(s);

        // s=s.toLowerCase();

        for (int i = 0; i <10 ; i++) {
            int sayi2 = 10;
            System.out.println(sayi2+i);
        }
        // for loop içerisinde i ve sayi2 isminde 2 local variable oluşturulmuştur
        // loop dışında bunları kullanalım
        // i = 20;
        // System.out.println(i);
        // sayi2=20;
    }
        public static void staticMethod () {
            String str = "java mutluluktur";
            //    System.out.println(sayi);
            //    System.out.println(yeterMi);
        }

        public void staticOlmayanMethod () {
            boolean yeterMi = true;
            //    System.out.println(sayi);
            //    System.out.println(str);
        }
    }

