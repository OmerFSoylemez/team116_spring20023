package Day16_arrayList;

import java.util.Scanner;

public class C11_forEachLoopQ {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir cümle bir harf alın,
        // harf cümlede kullanılmışsa kaç kere kullanıldığını yazdırın.
        // kullanılmamışsa "harf cümlede kullanılmamış" yazdırın.

        //java
        //1) split ile parçalıyoruz
        //2)foreachloop harfler teker teker kontrol edilecek
        //3)istenilen harf denk geldiğinde sayaç bir arttırılır
        //4)sayac 0 ise "harf cümlede kullanılmamış" ....sıfırdan fazla ise kaçkere kullanıldığı yazdırılır.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz");
        String str = scan.nextLine();
        System.out.println("Lütfen arana kelimeyi giriniz");
        String arananHarf = scan.next();

       // String str = "Java ile herşey kolay";
        //String arananHarf="a";

        // 1) split ile parçalıyoruz array haline getiriyoruz
        String[] arr = str.split("");


        // 2) forEachLoop ile harfler teker teker kontrol edilir
        int sayac =0;
        for (String each:arr
             ) {

        // 3) istenilen harf denk geldiğinde sayaç bir arttırılır.(istenilen harf"a")
        if(each.equals("a")){
            sayac++;
        }
        }
        // 4)sayac 0 ise "harf cümlede kullanılmamış"...sıfırdan fazla ise kaç kere kullanuldığı yazdırılır.
        if (sayac==0){
            System.out.println("harf cümlede kullanılmamış");
        }else {
            System.out.println("aranan harf cümle içinde " +sayac+ " kere kullanılmış");
        }




    }
}
