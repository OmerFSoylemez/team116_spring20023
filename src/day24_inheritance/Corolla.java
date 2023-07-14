package day24_inheritance;

public class Corolla extends BToyota{

    String uretimYeri= "Turkiye";
    String lastik = "corolla araclar pirelli 195-60-15 lastik kullanır";
    String model = "Corolla";
    boolean otopark= false;
    boolean cruiseControl= true;

    public void hız(){
        System.out.println("Corolla araclar max 240 km hız yapar");
    }
    public void guvenlik(){
        System.out.println("Corolla araclar 12 hava yastığı kulllanır");
    }

    public static void main(String[] args) {

        Corolla corolla1= new Corolla();
        System.out.println(corolla1.uretimYeri);//C Turkiye
        System.out.println(corolla1.lastik);//C pirelli
        System.out.println(corolla1.model);//C Corolla
        System.out.println(corolla1.otopark);//C false
        System.out.println(corolla1.cruiseControl);//C true
        System.out.println(corolla1.marka);//B Toyota
        System.out.println(corolla1.tekerSayisi);//A 4
        corolla1.hız();//C240
        corolla1.guvenlik();// C 12 hava yastığı
        corolla1.aku();// B inci aku


    }

}
