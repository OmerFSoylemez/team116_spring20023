package day22_stringBuilder_acceessModifier;

public class C04_AccessModifiers {

    public String marka;
    String model;
    /*
        Eger bir method da veya class level'daki bir variable
        veya method da access modifier görünmüyorsa
        o class uyesi için default access modifier gecerlidir

        default keyword
        1- switch statement default value
        2- class level da oluşturulan variable lar için default değer
        3- default constructor
        4- default access modifier

        Access modifier ve static keyword berarber değerlendirilmelidir
        -class içerisinde düşünüldüğünde static keyword bir method içerisinde,
        herhangi bir class üyesinin kullanılabilir olup olmadığını belirler
        -başka class dan kullanım da ise static keyword kullanım yöntemi belirlenir
        static class üyeleri classIsmi,staticUyeIsmi şeklinde ulaşılırken
        static olmayan class üyeleri için obje oluşturulması şarttır

     */

        public static void method1(){

        }
        public void meyhod2(){

        }
        void method3(){

        }

}


