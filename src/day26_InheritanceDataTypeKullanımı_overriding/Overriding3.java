package day26_InheritanceDataTypeKullanımı_overriding;

public class Overriding3 extends Overriding2{

        public void method1(){
            System.out.println("Overriding1 method1");
        }

    @Override
    void method3() {
        super.method3();
    }
    /*
    Overriding method'u InteliJ de oluşturabilirisiniz
    bu durumda intelliJ 2 şey bekler

    1 - @Override Annootation
        kullanmak zorunda değiliz
        silerseniz CTE olmaz
        @Override notasyonu parent class daki
        overridden method u kontrol eder
        ve silinirse CTE verir.

     2 - super.method()
         mecburi değildir,
         silerseniz CTE olmaz
         bir class da hem overridden method hem de overridding method ÇALIŞMAZ

         Eger en güncel method ile birlikte
         parent class da geçersiz kılınan(overridden)
         method un da çalışmasını isterseniz
         super.method() kullanabilirsiniz
         
         */

    public static void main(String[] args) {

            Overriding3 obj1 = new Overriding3();
            obj1.method1();//"Overriding1 method1"
            obj1.method2();//"Overriding2 methor2"



             Overriding2 obj2 = new Overriding3();
             obj2.method1();//"Overriding3 method1"
             obj2.method2();//"Overriding2 methor2"


             Overriding1 obj3 = new Overriding3();
             obj3.method1();//"Overriding3 method1"
             obj3.method2();//"Overriddig2 method2"


             Overriding1 obj4 = new Overriding1();
             obj4.method1();//"Overriding1 method1"
             obj4.method2();//"Overriddig1 method2"




    }

}
