package day24_inheritance;

public class BToyota extends Araba{

    String marka= "Toyota";
    String uretimYeri="Uretim yeri belirtilmedi";
    String lastik="Toyota araçlar pirelli lastikleri kullanır";



    public void guvenlik(){
        System.out.println("Toyota araçlar extra güvenlik donanımlarına sahiptir");
    }
    public void aku(){
        System.out.println("Toyota araclar inci akü kullanır");
    }
}
