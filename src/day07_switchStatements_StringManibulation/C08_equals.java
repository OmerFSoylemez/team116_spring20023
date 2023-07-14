package day07_switchStatements_StringManibulation;

public class C08_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "JaVa";
        String str6 = new String("Java");
        // Normalde non-primitive data türündeki objeler, new keyword u ile oluşturulur.
        // String i de new keyword u ile oluşturabiliriz
        // ancak java bizim işimizi kolaylaştırmak için
        // String e direk değer atamasınıda sağlamıştır.

        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3)); //false
        System.out.println(str4.equals(str5)); //false
        System.out.println(str2.equals(str6)); //true

        /*
        equals verilen iki String'in metin olarak aynı olup olmadığına bakar case sensitive dir.
        Dolayısıyla büyük küçük harf farklarına dikkat edilmelidir.
         */

        //   String için == kullanılamaz mı?
        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1==str6); //false

        /*
        equals metodu sadece değerlere bakar
        metin ayni ise sonuç true, metin farklı ise sonuç false olur

        ==ise metin degerine hemde referansa bakar
        ilerde anlatılacağı üzere java bazen aynı referansları
        farklı objelerede verir.
        konu ilerde detaylandırılacak

        SİMDİLİK
        iki String'in metin olarak aynı olduğunu kontrol etmek için equals
        metodunu kullanmalısınız, == kullanmamalısınız

         */







        
    }
}
                                              