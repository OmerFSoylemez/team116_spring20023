package day06_ifElseStatements_ternary_Operators;

public class C06_Ternary {
    public static void main(String[] args) {


        //Verilen sayı pozitif ise değerini 2 katına çıkarın
        // pozitif değilse negatif ise değerini 10 artırın

        int sayi = 10;

        sayi= sayi>0 ?  2*sayi : sayi +10;

        // Ternary bize sonuç verir, bu sonucu ya direk yazdırmalıyız veya variabla a atamalıyız


        //sayi çift ise 2 katini yazdırın, tek ise tek sayi yazdirin.
        sayi++;

        System.out.println(sayi%2==0 ? 2*sayi : "tek sayi");

        /*
        Eger sartın saglanması veya saglanamaması durumunda çalışacak kodlar
        farklı data türlerinde ise o zaman
        atama yazpamayız, çünkü sonuç tek bir data türünde değil
        bu durumda ternary'i sadece yazdırabiliriz.
         */

        // sayi= sayi%2 ==0 ? 2*sayi : "tek sayi";
        // String str = sayi%2 ==0 ? 2*sayi : "tek sayi";




    }
}
