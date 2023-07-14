package day22_stringBuilder_acceessModifier;

public class C02_StringBuilderMethodlari {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        sb1.append(".");

        System.out.println(sb1);// Java Candir.

        String str = "Bu gun hava çok guzel";
        sb1.append(str,2,6);
        System.out.println(sb1);//Java Candir. gun

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1); // Selenium Candir. gun

        sb1.insert(9,"heye");
        System.out.println(sb1);//Selenium Candir. gun

        sb1.insert(0,str,0,3);
        System.out.println(sb1);// Bu Selenium heyeCandir. gun

        sb1.delete(23,27);
        System.out.println(sb1);//Bu Selenium heyeCandir.

        int indexC= sb1.indexOf("C");
        sb1.deleteCharAt(indexC);

        System.out.println(sb1);//Bu Selenium heyeandir.
        sb1.insert(indexC,"c");

        System.out.println(sb1);//Bu Selenium heyecandir.

        sb1.reverse();
        System.out.println(sb1);//.ridnaceyeh muineleS uB
        sb1.reverse();
        System.out.println(sb1);//Bu Selenium heyecandir.

        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb2));//-8

        StringBuilder sb3 = new StringBuilder("Bu Java Candir");
        System.out.println(sb1.compareTo(sb3));//9

        StringBuilder sb4 = new StringBuilder("Bu Selenium heyecandir");
        System.out.println(sb1.compareTo(sb4));//0



        System.out.println(sb1 == sb4); //false
        System.out.println(sb1 == sb1); //true

        System.out.println(sb1.equals(sb4));//false
        System.out.println(sb1.equals(sb1));//true

        /*
            String builder için == ile equals aynı işlevi yapar
            sadece bir sb'i kendisiyle == ,equals() ile karşılaştırırsanız TRUE
            diger durumlarda false döner

            bir sb'in metin olarak başka bir stringbulding ile aynı olup olmadığını
            kontrol etmek için compare() kullanılır
            compare() in sonucu 0(sıfır) ise iki metin aynı
            0 değilse iki metin farklı diyebiliriz
         */

        String str2= "Bu Selenium heyecandir.";

        //System.out.println(sb1 == str2); // Java da farklı non primitive data türündeki
                                           // objeler == ile kontrol EDİLEMEZ

        System.out.println(sb1.equals(str2));// Java itiraz etmez ancak sonucu her zaman false verir.

        //System.out.println(sb1.compareTo(str2));//compare methodu iki sb. karşılaştırır.









    }

}
