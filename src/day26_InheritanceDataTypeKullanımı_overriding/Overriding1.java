package day26_InheritanceDataTypeKullanımı_overriding;

public class Overriding1 {
    /*
        Overridding , child class da oluşturulan bir method'un
        parent class daki aynı isim ve signature a sahip olan
        method'u geçersiz kılmasıdır.

        return type signature adahil değildir.
        yani return type ların aynı olması şart değildir
        ancak return type lar için özel bir kural vardır

        access modifier signature adahil değildir.
        yani access modifier ların aynı olması şart değildir
        ancak buna da özel bir kural vardır

    */

    void method1(){
        System.out.println("Overriding1 method1");
    }

    Object method2(){
        System.out.println("Overriddig1 method2");
        return 5;
    }
}
