package Day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidenIntListOlusturma {

    //kullanicidan int list oluşturup döndüren bir method oluşturun

    public static void main(String[] args) {


        System.out.println(kullanicidanSayiAlarakListeOlusturanMethod());
    }

    public static List<Integer> kullanicidanSayiAlarakListeOlusturanMethod(){

        Scanner scan = new Scanner(System.in);

        //kullanicidan sayilar loop içerisinde alınacak, loop sayisi bilinmediğinden while
        //kullanici sıfıra basınca loop duracak
        int girilenSayi= 4;
        List<Integer>sayilar = new ArrayList<>();

        //girilen sayi = a eşit olmadığı sürece loop devam etmeli

        while (girilenSayi!=0){

            System.out.println("Lütfen listeye eklemek için bir sayi giriniz");
            girilenSayi= scan.nextInt();

            if (girilenSayi!=0){
                sayilar.add(girilenSayi);
            }
        }
        return sayilar;
    }

}
