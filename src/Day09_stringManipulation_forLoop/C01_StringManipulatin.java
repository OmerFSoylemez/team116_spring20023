package Day09_stringManipulation_forLoop;

import java.util.Scanner;

public class C01_StringManipulatin {
    public static void main(String[] args) {

        //Soru 1 : Kullanicidan bir cumle alin
        //       - cumlede ev geciyorsa, “home home sweet home” yazdirin
        //       - cumlede is geciyorsa, “calismak guzeldir”
        //       - ikisini de iceriyorsa “Hem ev lazim hem is”
        //       - hicbirini icermiyorsa “cok calisman lazim” yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin");
        String cumle = scanner.nextLine();

        //if-else kullanmalıyız, en kısıtlayıcı olandan başlayalım

        if(cumle.contains("ev")&& cumle.contains("is")){
            System.out.println("Hem ev lazım hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("çalışöak güzeldir");
        }else {
            System.out.println("çok çalışman lazım");
        }
    }
}
