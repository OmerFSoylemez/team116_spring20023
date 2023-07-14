package day07_switchStatements_StringManibulation;

import java.util.Locale;

public class C05_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candır.";

        //tümünü büyük harf olarak yazdırın

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str);//Java Candır

        //str'i büyük harfe kalıcı olarak
        // dönüştürülmüş haline dönüştürün

        str = str. toUpperCase();

        System.out.println(str); //JAVA CANDIR.

        System.out.println(str.toLowerCase());//java candır

        // str'ı Türkçe karekterleri dikkate alarak küçük harfe çevirin.

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        String str2 = "Kimse beni aramıyor.";
        // Türkçe karakterlere uygun olarak büyük haliyle yazdırın.

        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));//KİMSE BENİ ARAMIYOR.
















    }
}
