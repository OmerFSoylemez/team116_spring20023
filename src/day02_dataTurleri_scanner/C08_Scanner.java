package day02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // soru-5 Kullanıcın ismini soyismini ve yaşını alıp
        //        asagidaki formatta yazdirin
        //        girilen bilgiler: J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sirasiyla isminizi soy isminizi ve yasinizi giriniz");

        char isimIlkHarf= scanner.nextLine().toUpperCase().charAt(0);
        String soyisim= scanner.nextLine();
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler:" +isimIlkHarf+ " " +
                soyisim+ ", "+ yas);


    }
}
