package Day12_doWhileLoop_scope;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise true değilse false yazdırınız.
        //        Ornek : input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        int karakok = 2;
        boolean tamKareMi = false;

        do {
            if (sayi == karakok * karakok) {
                tamKareMi = true;
                break;
            }
            karakok++;

        }while ((karakok*karakok<= sayi));
        System.out.println(tamKareMi);
    }
}
