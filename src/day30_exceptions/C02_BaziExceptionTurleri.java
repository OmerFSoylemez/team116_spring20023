package day30_exceptions;

public class C02_BaziExceptionTurleri {

    public static void main(String[] args) {

        //String str1 = null; //null bir değer değil pointer dır

        //System.out.println(str1.concat("Java"));

        // StringIndexOutOfBoundsException
        // ArrayIndexOutOfBoundsException

        String a = "34"; //34a yazarsak parseInt() bunu sayıya ceviremez ve exception fırlatır
        String b = "55";

        // a ve b cariable'larındaki sayıların toplamını yazdırın

        int sonuc = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println(sonuc);


        String str = "Nasıl ama";
        Object obj = str;

        Integer sayi = (Integer) obj; // ClassCastException

        // FileNotFoundException
        // IOException
        // RunTimeException
        // Exception
        // Arithmetic Exception
        // InputMısMatchExpection










    }
}
