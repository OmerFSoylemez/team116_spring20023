package day27_pollymorphism_abstractClasses;

public abstract class C03_Araba {
    /*
    parent class da istediğimiz herhangi bir method u
    child class ların TUMU override etmek zorunda kalsın istiyorsak
    o method u abstract yaparız

    Eger abstract yapılan bir method
    tum chald class lar tarafından OVERRİDE edilecekse
    parent class daki abstract method
    hiçbir zaman ÇALIŞMAYACAKTIR.
    override edildiği için guncel olan
    child class lardaki overriding method lar çalışacaktır
    o zaman abstract method ların body e ihtiyacı yoktur.
     */

    abstract void teker();

    abstract void motor();

    abstract void gosterge();

    void guvenlik(){
        System.out.println("Arabaların güvenlik önlemleri olsa iyi olur");
    }

    void klima(){
        System.out.println("Arabaların klimaları olabilir");
    }
}
