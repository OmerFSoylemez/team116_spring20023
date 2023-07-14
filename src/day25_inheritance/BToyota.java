package day25_inheritance;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("Toyota constrantor çalıştı");
    }
    BToyota(int yil){
        this();
        System.out.println("Toyota int parametreli bir constructor çalıştı");
    }
    String uretimYeri;
    String marka= "Toyota";
}
