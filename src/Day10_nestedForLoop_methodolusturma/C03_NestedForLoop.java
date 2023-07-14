package Day10_nestedForLoop_methodolusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
            verilen bir sayı için aşağıdaki tabloyu oluşturun.

           orn : sayi =3

           1*1  1*2  1*3
           2*1  2*2  2*3
           3*1  3*2  3*3

         */
        int sayi = 3;

        for (int i = 1; i <=sayi; i++) {  //dışardaki loop(outer) satırları kontrol eder

            for (int j = 1; j <= sayi; j++) { //içerdeki loop(inner) sutunları kontrol eder.

                System.out.print(i +"*"+j+"  ");

            }
            System.out.println("");

            System.out.println("====================");
            /*
            verilen iki sayi için aşağıdaki tabloyu oluşturun
            orn : a = 3
                  b = 4

           1*1  1*2  1*3  1*4
           2*1  2*2  2*3  2*4
           3*1  3*2  3*3  3*4

             */

            int a = 3;
            int b = 4;

            for (int j = 1; j <=a ; j++) {

                for (int k = 1; k <=b ; k++) {

                    System.out.print(j+ "*" +k+"  ");

                }
                System.out.println("");
            }
        }
    }
}
