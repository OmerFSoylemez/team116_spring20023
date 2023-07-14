package day25_inheritance;

import day24_inheritance.FCorolla;

public class Corolla extends BToyota {
    Corolla() {

        System.out.println("Corolla constructor çalıştı");
    }

    Corolla(int sayi) {

        System.out.println("Corolla int parametre constructor çalıştı");

    }
    Corolla(String yakıt){
        super(5);
        // parent class da olmayan bir constructor
        // call yapılırsa Java CTE verir
        System.out.println("Corolla string parametreli constructor çalıştı");
    }



    String uretimYeri = "Turkiye";
    String modelCorolla = "Corolla";

    public static void main(String[] args) {

        Corolla corolla2 = new Corolla("elektrik");

    }
}
