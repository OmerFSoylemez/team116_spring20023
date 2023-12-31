package Day08_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {
        /*
        contains methodu, bir yazı parçacığının, başka bir yazı içerisinde olup olmadığını kontrol eder.
        eger içeriyorsa true, içermiyorsa false cevabını bize verir (döndürür)
         */

        String str = "Java ile herşey çok kolay";

        System.out.println(str.contains("java")); //false // case sensitive
        System.out.println(str.contains("Java")); //true

        String arananKelime = "cok";

        System.out.println(str.contains(arananKelime)); //true

        String olmayanKelime ="Deniz";

        System.out.println(str.contains(olmayanKelime));//false

        System.out.println(str.contains("a")); //true

        System.out.println(str.contains(" ")); //true

        System.out.println(str.contains("")); //true






    }
}
