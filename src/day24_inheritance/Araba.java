package day24_inheritance;

public class Araba {

    String marka = "Araba markası belirtilmedi";
    String model = "Araba modeli belirtilmedi";
    int tekerSayisi= 4;

    public void hiz(){
        System.out.println("Arabalar motor ve yakıta göre maximum hız belirler");
    }
    public void güvenlik(){
        System.out.println("Tüm arabalar güvenlik önlemleri bulundurmalıdır");
    }
    /*
        Bir projede kod yazmaya başlamadan önce tasarım yapılmalıdır.
        oluşturulacak muhtemel class lar belirlenmeli
        bunlar arasında nasıl bir ilişki kurulacağı,
        hangi class'ların parent/child olacağı düşünülmelidir.

        Daha genel özellikler parent class lara
        daha spesifik ve o class a ait özellikler child class lara konulmalıdır.

        Araba ve Toyota class'ları obje oluşturmayacağımız,
        sadece child class'larını organize etmek
        ve ortak özellikleri belirlemek için
        tasarlanan class'lardır
        Bu tür class larda main method olmasına gerek yoktur.
        (abstract class ve Interface lerde ele alınacak)


        bir özelliği variable olarak oluşturmak ile
        method (dinamik özellikler) olarak oluşturmak arasında
        kullanımda bir fark vardır.(Overriding konusunda ele alınacak)

     */
}
