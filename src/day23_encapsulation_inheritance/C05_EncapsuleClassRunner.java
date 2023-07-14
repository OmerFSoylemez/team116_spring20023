package day23_encapsulation_inheritance;

public class C05_EncapsuleClassRunner {

    public static void main(String[] args) {

        C04_EncapsuleClass obj = new C04_EncapsuleClass();


        obj.publicStr="Java super";//write
        System.out.println(obj.publicStr);//read

        obj.setPrivateStr("Herseyi düşünmüşler");//write
        System.out.println(obj.getPrivateStr());//read

        /*
        Bir class üyesini private yapıp
        hem getter, hem de setter method u oluşturmak ile

        o class üyesini public yapmak arasında işlev açısından
        BİR FARK YOKTUR

        Bazı developer'lar public yapmak yerine
        private yapıp, getter setter oluşturmayı tercih ederler
        buradaki temel amaç public olduğunda yapılamayan bir işlemi yapmak DEĞİL
        atama ve okuma işlemlerine VURGU YAPMAKTIR.
         */


    }
}
