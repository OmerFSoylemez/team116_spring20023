package day27_pollymorphism_abstractClasses;

public abstract class C07_AbstractP extends C06_AbstractGP{
    /*
         Abstract bir class'ın concrete child i
         Parent i olan abstract class daki tüm abstract methodları IMPLEMENT etmek ZORUNDADIR.

         Concrete olmayan yani abstract child class lar
         parent abstract class daki abstrack methodları
         implement etmek ZORUNDA DEĞİLDİR
         isterse implement eder, isterse etmez

         Aynı şekilde parent abstract class'daki
         concrete method ları da
         isterse implement eder, isterse etmez
     */
    protected void method1(){
        System.out.println("Parent class concrete method1");
    }

    protected void method4() { System.out.println("Parent class concrete method4");}

    protected abstract void method5();

    protected void method(){
        System.out.println("Parent class concrete method6");
    }
}
