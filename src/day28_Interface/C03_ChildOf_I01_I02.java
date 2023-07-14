package day28_Interface;

import day27_pollymorphism_abstractClasses.C04_Toyota;

public class C03_ChildOf_I01_I02 extends C04_Toyota implements I01_Interface,I02_Interface{

    /*
   Bir class birden fazla class'ı inherit EDEMEZ
   ANCAK
   bir child class bir class'ı inherit ederken
   aynı zamanda başka interface(ler)i de inherit edebilir

   Birden fazla Interface'i inherit etmek istediğimizde
   dikkate etmemeiz gereken konu :

   Eger inherit etmek istediğimiz farklı interface'lerde
   aynı isimde AMA farklı returnType'a sahip method varsa
   iki Interface'i birden IMPLEMENT EDEMEYİZ

   Interface'lerde oluşturulan variable'lar public static ve final'dır
   yani heryerden ulaşılabilir ama DEĞİŞTİRİLEMEZ

   eger bir child class'in implement ettiği farklı interface'lerde
   ayni isimde variable varsa
   static yöntem kullanılarak interfaceIsmi.VariableIsmi ile kullanılır

    */
    public static void main(String[] args) {
        System.out.println(I01_Interface.SAYI);//20
        System.out.println(I02_Interface.SAYI);//30
        System.out.println(DERS);
        // sayi =30;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.PI);
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method4() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }

}
