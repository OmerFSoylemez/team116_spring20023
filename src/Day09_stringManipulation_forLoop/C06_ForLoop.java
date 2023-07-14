package Day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı alın ve bu sayılar dahil olarak
        // arasındaki 3 ile bölünebilen sayıları yazdırın
        // ilk girilen sayi ikinci girilen sayidan büyük ise hata mesajı yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki pozitif tamsayi giriniz");

        int ilkSayi = scanner.nextInt();
        int ikinciSayi = scanner.nextInt();

        if (ilkSayi>ikinciSayi) {
            System.out.println("Ilk sayi daha küçük olmalıdır");

        }else {

            for (int i = ilkSayi; i <=ikinciSayi ; i++) {

                if(i%3==0){
                    System.out.println(i+" ");
                }

            }
        }


    }
}
