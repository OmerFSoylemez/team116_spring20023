package day27_pollymorphism_abstractClasses;

import java.util.ArrayList;

public class C02 extends C01_OverridingReturnType{

    void method1(){

    }

   //double method2 {
        //Return type void veya PRIMITIVE data türü ise
        //overridden method ile overrining method'un return type ları
        //AYNI OLMALIDIR

        //return 3;

    String metho3(){
        //Return type NON-PRIMITIVE ise
        //child class daki method un return type i
        //parent class'daki overridden method'un return type'inin
        //AYNISI veya CHİLD CLASS ı olmalıdır
        //(IS A reletionship ile kontrol edilebilir)
        //Buna Covariant

        return "Selenium Heyecandır";
    }
    ArrayList<String>method4(){
        return new ArrayList<>();
    }
}
