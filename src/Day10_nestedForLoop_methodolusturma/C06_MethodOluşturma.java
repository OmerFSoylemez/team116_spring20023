package Day10_nestedForLoop_methodolusturma;

public class C06_MethodOluşturma {
    public static void main(String[] args) {

        String str = "java'nın robotları";

        str.toUpperCase();

        /*
        Eger bir method bize bir sonuç döndürüyorsa
        method u çalıştırmak sonucu görmek için
        yeterli DEĞİLDİR.

        sonucu görmek istiyorsak
        -ya direk methodCall u sout içerisinde yazarız
        -veya dönen bilgiyi bir variable a kaydeder
        kodumuzda istediğimiz zaman onu yazdırır ve kullanırız

         */

        System.out.println(str.toUpperCase()); //JAVA'NIN ROBOTLARI

        str = str.toUpperCase();


    }
}
