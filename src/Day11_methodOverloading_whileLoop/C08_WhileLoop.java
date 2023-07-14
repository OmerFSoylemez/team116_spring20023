package Day11_methodOverloading_whileLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*  While loop mu for loop mu?
            bu sorunun cevabı yapacağınız işe bağlı

            döngü sayısı belli  ise for loop kullanmak daha pratiktir
            ancak önceki sorulardaki gibi başlangıç bitiş değerleri verilmemişse
            veya döngü sayısı belirli değilse while loop daha avantajlı olur

         */


        // 1'den 100 ' e kadar olan sayıları yan yana yazdırın

        for (int i = 1; i <100 ; i++) {
            System.out.print(i+"  ");
        }
        System.out.println("");

        // aynı soruyu while loop ile yapalım

        int sayi =1;

        while (sayi<=100){
            System.out.print(sayi + "  ");
            sayi++; // sayı unutulursa sonsuz loop oluşur
        }
    }


}
