package day04_increment_concatination;

public class C06_LogicalOperators {
    public static void main(String[] args) {

        /*
        Java'da karşılaştırma operatörleri SADECE 2 variable i karşılaştırır.
         */

        int a = 10;
        int b = 20;
        int c = 15;

        // üçünün birbirine eşit olduğunu kontrol edin.

        System.out.println( a==b && b==c);//false

        // a sayısının pozitif ve 2 ile tam bölünebilir olduğunu kontrol edin

        System.out.println(a>0 && a%2==0);//true

        //b sayisinin 10 ile 50 arasında olduğunu konrol edin

        System.out.println(10<b && b<50);//true

        //b sayısının 10 ile arasında olmadığını kontrol edin

        System.out.println(b<10 || 50<b);//false




    }
}
