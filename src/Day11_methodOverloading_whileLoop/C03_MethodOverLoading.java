package Day11_methodOverloading_whileLoop;

public class C03_MethodOverLoading {

    public static void main(String[] args) {

        /* overloading : asırı yükleme
            Bir class da aynı isme sahip birden fazla method olmasına denir

            Javada bir class içinde aynı isim, aynı sayıda ve data türünde parametre ile
            oluşturulursa Java CTE verir(Altını kırmızı çizer.)

            bunun 3 çözümü vardır
            1- parametre sayısı değiştirilebilir.
            2- parametrelerin data türleri değiştirilebilir
            3- farklı data türünde parametrelerin yeri değiştirilebilir.

            Java bir metod call olduğunda
            aynı isimdeki birden fazla method'dan hangisinin çalışacağını belirlemek için
            argument-parametre uyumuna bakar
        */

        topla(5,8);
        topla('a','b');
        topla(3.4,5);
        topla(5,2.1);


    }
        public static void topla (int sayı1, int sayı2){
            System.out.println("İki int'ın toplamı:" +(sayı1+sayı2));
        }
        public static void topla (int a, int b,int c){
        System.out.println("üç int'ın toplamı:" +(a+b+c));
    }
        public static void topla (char char1, char char2){
        System.out.println("İki char'ın toplamı:" +(char1+char2));
    }
        public static void topla (int sayı1, double sayı2){
        System.out.println("int ve double toplamı:" +(sayı1+sayı2));
    }
        public static void topla (double sayı1, int sayı2){
        System.out.println("Double int'ın toplamı:" +(sayı1+sayı2));
    }


}
