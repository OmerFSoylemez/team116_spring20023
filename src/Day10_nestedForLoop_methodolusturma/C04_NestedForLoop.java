package Day10_nestedForLoop_methodolusturma;

public class C04_NestedForLoop {
    public static void main(String[] args) {

        /*
        Verieln sayı için aşağıdaki şekli oluşturun

        int sayi = 4

        1
        1  2
        1  2  3
        1  2  3  4
         */

        int sayi =4;
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(j+"  ");
            }
            System.out.println("");
        }
    }
}
