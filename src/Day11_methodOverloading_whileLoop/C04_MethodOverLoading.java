package Day11_methodOverloading_whileLoop;

public class C04_MethodOverLoading {
    public static void main(String[] args) {

         /*
        Java overloading yapılmış methodlardan hangisinin çalışacağına
        karar verirken adım adım ilerler
        1- eger argumentler ve parametreler tamamen uyumluysa onu çalıştırır.
        2- eger argumentler ve parametreler %100 uyumlu değilse casting yapabilir miyim diye bakar
        3- casting ile çalıştıracağı birden fazla method bulursa
         en az casting ile çalıştıracağını tercih eder.

         */

        topla(4,5);

        topla('a','b');

        topla(3.2f,5.1f);

    }

    public static void topla(double sayi1, double sayi2){

        System.out.println("İki doubl'ın toplamı :"+(sayi1+sayi2));
    }
    public static void topla(int sayi1, float sayi2){

        System.out.println("İnt ve float toplamı :"+(sayi1+sayi2));
    }
    public static void topla(int sayi1, int sayi2){

        System.out.println("İki int'ın toplamı :"+(sayi1+sayi2));
    }
}
