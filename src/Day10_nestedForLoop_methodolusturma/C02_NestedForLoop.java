package Day10_nestedForLoop_methodolusturma;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen satır ve sutun sayısına uygun olarak
        asağıdaki şekli yazdırın


        ornek : satir 4 , sütun 5


        * * * * *
        * * * * *
        * * * * *
        * * * * *

         */

        int satirSayisi = 4;
        int sutunSayisi = 5;

        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
