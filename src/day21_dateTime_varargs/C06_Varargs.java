package day21_dateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        // iki tamsayıyı toplayıp yazdıran bir method oluşturun

        //topla(15,6);
        //topla(15,20,25);
        //topla(10,13,44,33);
        //topla(12,44,57,87,15);
        //topla(15,6,78,58,45,14,25);

    }
    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4){
        System.out.println("sayiların toplamı:"+(sayi1+sayi2+sayi3+sayi4));
    }
}
