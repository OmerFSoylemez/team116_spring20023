package day23_encapsulation_inheritance;

import day22_stringBuilder_acceessModifier.C05_accessModifier;

public class C01_AccessModifierKullanımı extends C05_accessModifier {

    public static void main(String[] args) {

        // başka package daki bir class dan class üyelerinin
        // sadece public olanlarını kullanabiliriz
        // eger bulunduğumuz class ile ulaşmak istediğimiz class arasında
        // parent-child ilişkisi varsa class üyelerine erişim mümkündür

        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier.publicStaticMethod();

        C05_accessModifier.protectedStaticSayi = 10;
        C05_accessModifier.publicStaticSayi = 25;

        System.out.println(C05_accessModifier.publicStaticSayi);//25
        System.out.println(C05_accessModifier.protectedStaticSayi);//10

        /*
        Access modifier ile erişimi düzenlenen bir class üyesine
        başka class lardan erişebilirsek
        hem değer ataması yapılabilir, hemde o class üyesinin değeri yazdırabiliriz
         */
    }
}
