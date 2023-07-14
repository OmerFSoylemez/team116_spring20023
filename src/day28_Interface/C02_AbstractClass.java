package day28_Interface;

public abstract class C02_AbstractClass {

    abstract void method1();

    void method2(){

    }

    public static void main(String[] args) {
        /*
        Abstract class'lar class oldukları için Constructor a sahiptirler
        ANCAK
        Abstract class'lardan OBJE OLUŞTURULAMAZ

        cunku abstract class'larda abstract method'lar bulunabilir
        bu class'lardan obje oluşturulursa
        abstact method'ları çalıştırmak ister
        ama abstract method'ların body si olmadığından
        bir değer üretemez
         */
        /*
        C02_AbstractClass abstractClassObje = new C02_AbstractClass();
        abstractClassObje.method1();

         */
    }
}
