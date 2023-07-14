package day03_DataCasting_wrapperClasses;

public class C05_WrapperClasses {
    public static void main(String[] args) {

      int sayi =10;

      //primitive data türlerinin hazır metodları YOKTUR
        // Java primitive data türleri ile bazı metodları kulllanabilmemiz için
        // özel Wrapper Class lar oluşturmuş.


        Integer sayWrap =10 ;
        /*
        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean
        classları primitive data türleri ile aynı değerleri alabilir.
        Aynı data turundeki primitive ve Wrapper Class arasında hiçbir casting olmaksızın atama yapabilirler.
         */

        sayWrap =sayi;
        sayi = sayWrap;

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648

        String str1 = "34";
        String str2 = "45";

        // bu iki string içindeki sayıların toplamını yazdırın

      System.out.println((str1 + str2));//3445

      System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));//79

      char chr ='m';
      // chr yi büyük harf olarak yazdırın.

      System.out.println(Character.toUpperCase(chr));//M

      System.out.println(Character.isAlphabetic(chr));//true

      System.out.println(Character.isDigit(chr));//false

      Double dbl =34.4;
      String doubleStr = "44,3";

       // doubleStr değerinin 5 eksiğini yazdırın.

      System.out.println(Double.parseDouble(doubleStr)-5);
      {

        }

    }
}
